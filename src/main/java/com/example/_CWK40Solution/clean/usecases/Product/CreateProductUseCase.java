package com.example._CWK40Solution.clean.usecases.Product;

import com.example._CWK40Solution.clean.entities.Product.Gateway.ProductGateway;
import com.example._CWK40Solution.clean.entities.Product.Model.Product;
import com.example._CWK40Solution.clean.usecases.Product.dto.IProductCreation;

public class CreateProductUseCase {

    private final ProductGateway productGateway;

    public CreateProductUseCase(ProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    public Product execute(IProductCreation newProduct) {
        Product product = new Product(newProduct.name());
        return this.productGateway.create(product);
    }

}
