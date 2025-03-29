package com.example._CWK40Solution.clean.infrastructure.Product.controller;

import com.example._CWK40Solution.clean.entities.Product.Exceptions.ProductNotFoundException;
import com.example._CWK40Solution.clean.entities.Product.Model.Product;
import com.example._CWK40Solution.clean.infrastructure.Product.dto.ProductPublicData;
import com.example._CWK40Solution.clean.usecases.Product.GetProductUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetProductController {
    private final GetProductUseCase getProductUseCase;

    public GetProductController(GetProductUseCase getProductUseCase) {
        this.getProductUseCase = getProductUseCase;
    }

    @GetMapping("/products/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductPublicData getProduct(@PathVariable Long id) throws ProductNotFoundException {
        Product product = getProductUseCase.execute(id);
        return new ProductPublicData(product);
    }
}