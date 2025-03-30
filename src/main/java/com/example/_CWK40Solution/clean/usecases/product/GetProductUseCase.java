package com.example._CWK40Solution.clean.usecases.product;

import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidIdException;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidNameException;
import com.example._CWK40Solution.clean.entities.product.ProductGateway;
import com.example._CWK40Solution.clean.entities.product.Product;
import org.hibernate.annotations.NotFound;

public class GetProductUseCase {
    private final ProductGateway productGateway;

    public GetProductUseCase(ProductGateway productGateway){
        this.productGateway = productGateway;
    }

    public ProductPublicData execute(Long id) throws NotFoundException, InvalidNameException, InvalidIdException {
        Product product = this.productGateway
                .findById(id)
                .orElseThrow( () -> new NotFoundException(id));
        return new ProductPublicData(product);
    }
}
