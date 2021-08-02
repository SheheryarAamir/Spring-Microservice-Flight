package com.stse.price.service;

import com.stse.price.entity.PriceEntity;
import com.stse.price.repository.PriceRepository;
import com.stse.price.utils.Mapper;
import com.stse.price.vo.PricingVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Slf4j
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public Mono<PricingVO> savePricingInformation(Mono<PricingVO> priceVO){
        log.info("Saving pricing information - Service");
        return  priceVO.map(Mapper::voToEntity)
                .flatMap(priceRepository::insert)
                .map(Mapper::entityToVo);
    }

    public Flux<PricingVO> findByFlightDateAndAirport(String flightNumber, String flightDate) {
        log.info("findByFlightDateAndAirport - Service");
        return priceRepository.findByFlightNumberAndFlightDate(flightNumber, flightDate)
                .map(Mapper::entityToVo);
    }


}
