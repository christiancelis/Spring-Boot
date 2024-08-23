package com.springhexagonal.demo.application.service.product;

import java.util.List;
import java.util.Optional;

import com.springhexagonal.demo.domain.entities.Product;

public interface ProductService {
    Optional <Product> findById(Long id);
    List <Product> getAll();
    Product save(Product product);
}
