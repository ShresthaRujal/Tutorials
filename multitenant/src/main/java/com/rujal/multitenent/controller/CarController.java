package com.rujal.multitenent.controller;

import com.rujal.multitenent.dto.CarDto;
import com.rujal.multitenent.domain.Car;
import com.rujal.multitenent.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping
    public ResponseEntity<?> saveCar(@RequestBody CarDto carDto){
        carService.save(Car.builder().brand(carDto.getBrand()).build());
        return ResponseEntity.ok("Car saved");
    }
}
