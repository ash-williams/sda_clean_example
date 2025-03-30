package com.example._CWK40Solution.clean.usecases.product;

import com.example._CWK40Solution.clean.entities.product.ProductGateway;
import com.example._CWK40Solution.clean.entities.product.Product;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidIdException;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidNameException;

import java.util.List;

public class SearchProductUseCase {
    private final ProductGateway productGateway;

    public SearchProductUseCase(ProductGateway productGateway){
        this.productGateway = productGateway;
    }

    public List<ProductPublicData> execute() throws InvalidNameException, InvalidIdException {
        return this.productGateway.findAll().stream().map(ProductPublicData::new).toList();
    }
}
