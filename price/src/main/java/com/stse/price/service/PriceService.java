package com.stse.price.service;

import com.stse.price.entity.PriceEntity;
import com.stse.price.repository.PriceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public PriceEntity savePricingInformation(PriceEntity priceEntity){
        log.info("Saving pricing information - Service");
        return priceRepository.save(priceEntity);
    }

    public List<PriceEntity> findByFlightDateAndAirport(String flightNumber, String flightDate) {
        log.info("findByFlightDateAndAirport - Service");
        return priceRepository.findByFlightNumberAndFlightDate(flightNumber, flightDate);
    }


}
