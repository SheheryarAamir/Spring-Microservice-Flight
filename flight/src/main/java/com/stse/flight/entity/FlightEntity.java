package com.stse.flight.entity;

import com.stse.flight.enums.FlightEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long flightId;
    private String flightNumber;
    private String flightDate;
    private String airport;
    @Enumerated(EnumType.ORDINAL)
    private FlightEnum departOrArrival;

}
