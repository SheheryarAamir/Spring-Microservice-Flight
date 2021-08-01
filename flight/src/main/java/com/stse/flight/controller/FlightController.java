package com.stse.flight.controller;

import com.stse.flight.VO.FlightVO;
import com.stse.flight.entity.FlightEntity;
import com.stse.flight.enums.FlightEnum;
import com.stse.flight.service.FlightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/flight")
@Slf4j
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/save")
    public FlightEntity saveFlightInformation(@RequestBody FlightEntity flightEntity){
        log.info("Saving flight information - Controller");
        return flightService.saveFlightInformation(flightEntity);
    }

    @GetMapping(value = "/{flightDate}/{airport}", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<String> findByFlightDateOrAirport(@PathVariable("flightDate") String flightDate,
                                                  @PathVariable("airport") String airport){
        log.info("findByFlightDateOrAirport - Controller");

        WebClient webClient = WebClient.create();

        //First Call
        webClient.get()
                .uri("/airport/{id}", "1")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(System.out::println);

        //Second Call
        webClient.get()
                .uri("/airport/{id}", "2")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(System.out::println);

        //Third Call
        webClient.get()
                .uri("/airport/{id}", "3")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(System.out::println);

        //Fourth Call
        webClient.get()
                .uri("/airport/{id}", "4")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(System.out::println);


        //Fifth Call
        webClient.get()
                .uri("/airport/{id}", "5")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(System.out::println);


        if(flightDate.isEmpty() && airport.isEmpty()){
            return Flux.just("No Data");
        }else if(flightDate.isEmpty()){
            return Flux.fromIterable(flightService.findByAirport(airport).stream()
                    .map(x -> x.getFlightNumber())
                    .collect(Collectors.toList()))
                    .delayElements(Duration.ofSeconds(1))
                    .log();
        }else if(airport.isEmpty()){
            return Flux.fromIterable(flightService.findByFlightDate(flightDate).stream()
                    .map(x -> x.getFlightNumber())
                    .collect(Collectors.toList()))
                    .delayElements(Duration.ofSeconds(1))
                    .log();
        }
        return Flux.fromIterable(flightService.findByFlightDateAndAirport(flightDate, airport).stream()
                .map(x -> x.getFlightNumber())
                .collect(Collectors.toList()))
                .delayElements(Duration.ofSeconds(1))
                .log();
    }
}
