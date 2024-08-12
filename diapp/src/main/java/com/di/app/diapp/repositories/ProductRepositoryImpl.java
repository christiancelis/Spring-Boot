package com.di.app.diapp.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.di.app.diapp.models.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository{

    List <Product> products;

    public ProductRepositoryImpl(List<Product> products) {
        this.products = Arrays.asList(
            new Product(1L,"Laptop",450l),
            new Product(2L,"SmarthPhone",200l),
            new Product(3L,"Tablet",120l),
            new Product(4L,"Monitor",800l),
            new Product(5L,"Keyboard",150l),
            new Product(6L,"Mouse",800l),
            new Product(7L,"Printer",700l),
            new Product(8L,"External HardDrive",350l),
            new Product(9L,"Webcam",250l)
        );
    }

    @Override
    public Product findById(Long id) {
       return products.stream().filter(p-> p.getId().equals(id)).findFirst().orElseThrow();
    }

    @Override
    public List<Product> findAll() {
       return products;
    }

    
}   
