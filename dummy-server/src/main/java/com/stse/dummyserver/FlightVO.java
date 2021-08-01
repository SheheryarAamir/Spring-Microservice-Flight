package com.stse.dummyserver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightVO {
    private String flightNumber;
    private String flightDate;
    private  String airport;
}
