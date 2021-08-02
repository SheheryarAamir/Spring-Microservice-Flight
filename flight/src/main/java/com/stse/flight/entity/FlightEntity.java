package com.stse.flight.entity;

import com.stse.flight.enums.FlightEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "flights")
public class FlightEntity {

    @Id
    private String id;
    private String flightNumber;
    private String flightDate;
    private String airport;
    private FlightEnum departOrArrival;

}
