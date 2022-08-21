package com.eliseu.cloudpark.controller;

import com.eliseu.cloudpark.model.Parking;
import com.eliseu.cloudpark.service.ParkingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping
    public List<Parking> findAll() {
        return parkingService.findAll();
    }


}
