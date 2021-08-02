package com.stse.flight.repository;

import com.stse.flight.entity.FlightEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface FlightRepository extends ReactiveMongoRepository<FlightEntity, Long> {
    Flux<FlightEntity> findByFlightDateAndAirport(String flightDate, String airport);
    Flux<FlightEntity> findByFlightDate(String flightDate);
    Flux<FlightEntity> findByAirport(String airport);
}
