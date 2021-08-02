package com.stse.price.controller;

import com.stse.price.entity.PriceEntity;
import com.stse.price.service.PriceService;
import com.stse.price.vo.PricingVO;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/price")
@Slf4j
public class PriceController {

    @Autowired
    private PriceService priceService;

    @PostMapping("/save")
    public Mono<PricingVO> savePricingInformation(@ModelAttribute PricingVO pricingVO){
        log.info("Saving pricing information - Controller");
        return priceService.savePricingInformation(Mono.just(pricingVO));
    }

    @GetMapping(value = "/{flightNumber}/{flightDate}", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<PricingVO> findByFlightNumberAndFlightDateReturnStream(@PathVariable("flightNumber") String flightNumber,
                                                                    @PathVariable("flightDate") String flightDate){
        log.info("findFlightByFlightNumber - Controller");
        return priceService.findByFlightDateAndAirport(flightNumber, flightDate)
                .log();

    }

}
