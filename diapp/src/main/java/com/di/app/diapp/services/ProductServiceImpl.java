package com.di.app.diapp.services;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.app.diapp.models.Product;
import com.di.app.diapp.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

   @Autowired
   private ProductRepository repositoryProduct;

    @Override
    public Product findById(Long id) {
        return repositoryProduct.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return repositoryProduct.findAll().stream().map(p->{
            Double priceImp = p.getPrice() * 1.45d;
            Product newProduct = new Product(p.getId(),p.getName(),priceImp.longValue());
            return newProduct;
       }).collect(Collectors.toList());
    }

  
}
