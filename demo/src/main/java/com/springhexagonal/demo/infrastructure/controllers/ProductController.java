package com.springhexagonal.demo.infrastructure.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springhexagonal.demo.application.service.product.ProductService;

@RestController
@RequestMapping("/api")

public class ProductController {

    @Autowired
    private ProductService productservice;

    
}
