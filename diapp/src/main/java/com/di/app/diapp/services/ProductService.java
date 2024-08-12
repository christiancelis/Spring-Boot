package com.di.app.diapp.services;



import java.util.List;

import com.di.app.diapp.models.Product;

public interface ProductService {
    List <Product> findAll();
    Product findById(Long id);
}
