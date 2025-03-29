package com.example._CWK40Solution.clean.infrastructure.Product.gateway;

import com.example._CWK40Solution.clean.entities.Product.Gateway.ProductGateway;
import com.example._CWK40Solution.clean.entities.Product.Model.Product;
import com.example._CWK40Solution.clean.infrastructure.config.db.repositories.ProductRepository;
import com.example._CWK40Solution.clean.infrastructure.config.db.schemas.ProductSchema;


import java.util.List;
import java.util.Optional;

public class ProductDatabaseGateway implements ProductGateway {
    private final ProductRepository productRepository;

    public ProductDatabaseGateway(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product product) {
        return this.productRepository.save(new ProductSchema(product)).toProduct();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository
                .findById(id)
                .map(ProductSchema::toProduct);
    }

    @Override
    public List<Product> searchByName(String nameFragment) {
        return List.of();
    }

    @Override
    public List<Product> findAll() {
        return productRepository
                .findAll()
                .stream()
                .map(ProductSchema::toProduct)
                .toList();
    }
}
