package com.springhexagonal.demo.infrastructure.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springhexagonal.demo.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
