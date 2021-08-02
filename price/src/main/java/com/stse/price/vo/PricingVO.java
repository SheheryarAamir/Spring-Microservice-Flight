package com.stse.price.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PricingVO {

    private long priceId;

    private String flightNumber;
    private String flightDate;
    private double price;
}
