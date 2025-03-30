package com.example._CWK40Solution.clean.entities.product;

import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidIdException;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidNameException;

import java.util.List;
import java.util.Optional;

public interface ProductGateway {
    Product create(Product product);
    Optional<Product> findById(Long id);
    List<Product> searchByName(String nameFragment);
    List<Product> findAll();
}
