package com.example._CWK40Solution.clean.usecases.Product;

import com.example._CWK40Solution.clean.entities.Product.Gateway.ProductGateway;
import com.example._CWK40Solution.clean.entities.Product.Model.Product;

import java.util.List;

public class SearchProductUseCase {
    private final ProductGateway productGateway;

    public SearchProductUseCase(ProductGateway productGateway){
        this.productGateway = productGateway;
    }

    public List<Product> execute() {
        return this.productGateway.findAll();
    }
}