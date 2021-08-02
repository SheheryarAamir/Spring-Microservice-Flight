package com.stse.price.repository;

import com.stse.price.entity.PriceEntity;
import com.stse.price.vo.PricingVO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface PriceRepository extends ReactiveMongoRepository<PriceEntity, Long> {

    Flux<PriceEntity> findByFlightNumberAndFlightDate(String flightNumber, String flightDate);
}
