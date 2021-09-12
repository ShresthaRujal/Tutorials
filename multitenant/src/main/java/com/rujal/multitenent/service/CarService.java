package com.rujal.multitenent.service;

import com.rujal.multitenent.domain.Car;

import java.util.List;

public interface CarService {

    void save(Car car);

    List<Car> findAll();
}
