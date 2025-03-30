package com.example._CWK40Solution.clean.infrastructure.controller;

import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidIdException;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidNameException;
import com.example._CWK40Solution.clean.usecases.product.ProductCreationData;
import com.example._CWK40Solution.clean.usecases.product.ProductPublicData;
import com.example._CWK40Solution.clean.usecases.product.CreateProductUseCase;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CreateProductController {
    private final CreateProductUseCase createProductUseCase;

    public CreateProductController(CreateProductUseCase createProductUseCase){
        this.createProductUseCase = createProductUseCase;
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductPublicData createProduct(@Valid @RequestBody ProductCreationData newProduct) throws InvalidNameException, InvalidIdException {
        return createProductUseCase.execute(newProduct);
    };


}




