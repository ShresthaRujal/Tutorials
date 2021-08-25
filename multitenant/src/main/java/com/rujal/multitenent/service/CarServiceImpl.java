package com.rujal.multitenent.service;

import com.rujal.multitenent.domain.Car;
import com.rujal.multitenent.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public void save(Car car) {
        carRepository.save(car);
    }
}
