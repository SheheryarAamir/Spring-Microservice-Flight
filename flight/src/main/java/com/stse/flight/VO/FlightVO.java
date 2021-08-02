package com.stse.flight.VO;

import com.stse.flight.enums.FlightEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightVO {
    private String id;
    private String flightNumber;
    private String flightDate;
    private String airport;
    private FlightEnum departOrArrival;

}