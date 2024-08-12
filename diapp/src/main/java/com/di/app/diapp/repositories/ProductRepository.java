package com.di.app.diapp.repositories;

import java.util.List;

import com.di.app.diapp.models.Product;

public interface ProductRepository {
    List <Product> findAll();
    Product findById(Long id);
}
