package com.rujal.multitenent.repository;

import com.rujal.multitenent.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
