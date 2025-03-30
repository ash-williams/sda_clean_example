package com.example._CWK40Solution.clean.infrastructure.controller;

import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidIdException;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidNameException;
import com.example._CWK40Solution.clean.usecases.product.NotFoundException;
import com.example._CWK40Solution.clean.usecases.product.ProductPublicData;
import com.example._CWK40Solution.clean.usecases.product.GetProductUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GetProductController {
    private final GetProductUseCase getProductUseCase;

    public GetProductController(GetProductUseCase getProductUseCase) {
        this.getProductUseCase = getProductUseCase;
    }

    @GetMapping("/products/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductPublicData getProduct(@PathVariable Long id) throws NotFoundException, InvalidNameException, InvalidIdException {
        return getProductUseCase.execute(id);
    }
}
