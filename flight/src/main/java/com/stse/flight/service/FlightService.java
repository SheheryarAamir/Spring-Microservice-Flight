package com.stse.flight.service;

import com.stse.flight.entity.FlightEntity;
import com.stse.flight.repository.FlightRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public FlightEntity saveFlightInformation(FlightEntity flightEntity) {
        log.info("Saving flight information - Service");
        return flightRepository.save(flightEntity);
    }

    public List<FlightEntity> findByFlightDateAndAirport(String flightDate, String airport) {
        log.info("findByFlightDateAndAirport - Service");
        return flightRepository.findByFlightDateAndAirport(flightDate, airport);
    }

    public List<FlightEntity> findByFlightDate(String flightDate) {
        log.info("findByFlightDate - Service");
        return flightRepository.findByFlightDate(flightDate);
    }

    public List<FlightEntity> findByAirport(String airport) {
        log.info("findByAirport - Service");
        return flightRepository.findByAirport(airport);
    }
}
