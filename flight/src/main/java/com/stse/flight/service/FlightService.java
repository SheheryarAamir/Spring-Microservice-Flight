package com.stse.flight.service;

import com.stse.flight.VO.FlightVO;
import com.stse.flight.entity.FlightEntity;
import com.stse.flight.repository.FlightRepository;
import com.stse.flight.utils.Mapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Slf4j
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;


    public Mono<FlightVO> saveFlightInformation(Mono<FlightVO> flightVO) {
        log.info("Saving flight information - Service");
        return  flightVO.map(Mapper::voToEntity)
                .flatMap(flightRepository::insert)
                .map(Mapper::entityToVo);
    }
    public Flux<FlightVO> findAllFlights() {
        log.info("Saving flight information - Service");
        return flightRepository.findAll().map(Mapper::entityToVo);
    }

    public Flux<FlightVO> findByFlightDateAndAirport(String flightDate, String airport) {
        log.info("findByFlightDateAndAirport - Service");
        return flightRepository.findByFlightDateAndAirport(flightDate, airport).map(Mapper::entityToVo);
    }

    public Flux<FlightVO> findByFlightDate(String flightDate) {
        log.info("findByFlightDate - Service");
        return flightRepository.findByFlightDate(flightDate).map(Mapper::entityToVo);
    }

    public Flux<FlightVO> findByAirport(String airport) {
        log.info("findByAirport - Service");
        return flightRepository.findByAirport(airport).map(Mapper::entityToVo);
    }
}
