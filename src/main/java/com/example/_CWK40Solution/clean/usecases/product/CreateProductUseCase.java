package com.example._CWK40Solution.clean.usecases.product;

import com.example._CWK40Solution.clean.entities.product.ProductGateway;
import com.example._CWK40Solution.clean.entities.product.Product;
import com.example._CWK40Solution.clean.entities.product.ProductName;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidNameException;

public class CreateProductUseCase {

    private final ProductGateway productGateway;

    public CreateProductUseCase(ProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    public ProductPublicData execute(ProductCreationData newProduct) throws InvalidNameException, DuplicateNameException {
        Product product = new Product(new ProductName(newProduct.name()));
        if(this.productGateway.checkName(product.getName()))
        {
            throw new DuplicateNameException(product.getName());
        }
        return new ProductPublicData(this.productGateway.create(product));
    }

}
