package com.stse.flight.repository;

import com.stse.flight.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, Long> {
    List<FlightEntity> findByFlightDateAndAirport(String flightDate, String airport);
    List<FlightEntity> findByFlightDate(String flightDate);
    List<FlightEntity> findByAirport(String airport);
}
