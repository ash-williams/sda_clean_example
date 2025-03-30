package com.example._CWK40Solution.clean.infrastructure.controller;

import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidIdException;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidNameException;
import com.example._CWK40Solution.clean.usecases.product.ProductPublicData;
import com.example._CWK40Solution.clean.usecases.product.SearchProductUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class SearchProductController {
    private final SearchProductUseCase searchProductUseCase;

    public SearchProductController(SearchProductUseCase searchProductUseCase){
        this.searchProductUseCase = searchProductUseCase;
    }

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductPublicData> searchProducts() throws InvalidNameException, InvalidIdException {
        return this.searchProductUseCase.execute();
    }
}


