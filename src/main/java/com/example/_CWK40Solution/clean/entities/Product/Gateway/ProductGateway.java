package com.example._CWK40Solution.clean.entities.Product.Gateway;

import com.example._CWK40Solution.clean.entities.Product.Model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductGateway {
    Product create(Product product);
    Optional<Product> findById(Long id);
    List<Product> searchByName(String nameFragment);
    List<Product> findAll();
}