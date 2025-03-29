package com.example._CWK40Solution.clean.usecases.Product;

import com.example._CWK40Solution.clean.entities.Product.Exceptions.ProductNotFoundException;
import com.example._CWK40Solution.clean.entities.Product.Gateway.ProductGateway;
import com.example._CWK40Solution.clean.entities.Product.Model.Product;

public class GetProductUseCase {
    private final ProductGateway productGateway;

    public GetProductUseCase(ProductGateway productGateway){
        this.productGateway = productGateway;
    }

    public Product execute(Long id) throws ProductNotFoundException {
        return this.productGateway
                .findById(id)
                .orElseThrow(ProductNotFoundException::new);
    }
}
