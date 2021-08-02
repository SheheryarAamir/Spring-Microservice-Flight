package com.stse.price.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "price")
public class PriceEntity {

    private long priceId;

    private String flightNumber;
    private String flightDate;
    private double price;
}
