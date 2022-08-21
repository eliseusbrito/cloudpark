package com.eliseu.cloudpark.controller;

import com.eliseu.cloudpark.controller.dto.ParkingDTO;
import com.eliseu.cloudpark.controller.mapper.ParkingMapper;
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
    private final ParkingMapper parkingMapper;

    public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
        this.parkingService = parkingService;
        this.parkingMapper = parkingMapper;
    }

    @GetMapping
    public List<ParkingDTO> findAll() {
        List<Parking> parkingList = parkingService.findAll();
        return parkingMapper.toParkingDTOList(parkingList);
    }

}
