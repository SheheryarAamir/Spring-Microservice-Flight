package com.stse.dummyserver.controller;

import com.stse.dummyserver.FlightVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/dummy")
@Slf4j
public class DummyController {


    @GetMapping("/airport/{id}")
    public String getAirport_Server(@PathVariable String flightNumber) {
        simulateDelayedProcessing();
        return "DXB";
    }


    @GetMapping("/airports")
    public List<String> getAirports_Server() {
        simulateDelayedProcessing();
        List<String> listAirport = new ArrayList<>();
        listAirport.add("DXB");
        listAirport.add("LHR");
        listAirport.add("IST");
        return listAirport;
    }

    @PostMapping("/airports")
    public String addAirport_Server(@RequestBody String airport) {
        simulateDelayedProcessing();
        return "LHR";
    }


    //Just to simulate a delay
    void simulateDelayedProcessing() {
        Random rand = new Random();
        try {
            Thread.sleep(rand.nextInt(800 - 500) + 500); //500ms - 800ms seconds
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }
}
