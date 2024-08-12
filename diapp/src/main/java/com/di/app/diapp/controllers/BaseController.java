package com.di.app.diapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.di.app.diapp.models.Product;
import com.di.app.diapp.services.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api")
public class BaseController {

    @Autowired
    private ProductService serviceProduct;

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return serviceProduct.findById(id);
    }

    @GetMapping("")
    public List <Product> find() {
        return serviceProduct.findAll();
    }
    
}
