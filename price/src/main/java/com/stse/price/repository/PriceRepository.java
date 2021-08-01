package com.stse.price.repository;

import com.stse.price.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {

    List<PriceEntity> findByFlightNumberAndFlightDate(String flightNumber, String flightDate);
}
