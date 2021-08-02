package com.stse.dummyserver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightVO {
    private String flightNumber;
    private String flightDate;
    private String airport;
    @Enumerated(EnumType.ORDINAL)
    private FlightEnum departOrArrival;
}
