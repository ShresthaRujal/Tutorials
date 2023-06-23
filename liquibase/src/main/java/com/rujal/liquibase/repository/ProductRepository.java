package com.rujal.liquibase.repository;

import com.rujal.liquibase.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
