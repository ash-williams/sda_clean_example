package com.example._CWK40Solution.clean.infrastructure.Product.controller;

import com.example._CWK40Solution.clean.infrastructure.Product.dto.ProductCreationData;
import com.example._CWK40Solution.clean.infrastructure.Product.dto.ProductPublicData;
import com.example._CWK40Solution.clean.usecases.Product.CreateProductUseCase;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateProductController {
    private final CreateProductUseCase createProductUseCase;

    public CreateProductController(CreateProductUseCase createProductUseCase){
        this.createProductUseCase = createProductUseCase;
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductPublicData createProduct(@Valid @RequestBody ProductCreationData newProduct){
        return new ProductPublicData(createProductUseCase.execute(newProduct));
    };


}




