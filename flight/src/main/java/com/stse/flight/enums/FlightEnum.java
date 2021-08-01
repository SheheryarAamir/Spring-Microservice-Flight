package com.stse.flight.enums;

public enum FlightEnum {
    DEPARTURE(000),
    ARRIVAL(001);

    private int value;
    FlightEnum(int value) { this.value = value; }
    public int getValue() { return value; }
}
