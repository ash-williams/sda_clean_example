package com.example._CWK40Solution.clean.infrastructure.Product.controller;

import com.example._CWK40Solution.clean.infrastructure.Product.dto.ProductPublicData;
import com.example._CWK40Solution.clean.usecases.Product.SearchProductUseCase;
import com.example._CWK40Solution.clean.entities.Product.Model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchProductController {
    private final SearchProductUseCase searchProductUseCase;

    public SearchProductController(SearchProductUseCase searchProductUseCase){
        this.searchProductUseCase = searchProductUseCase;
    }

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductPublicData> searchProducts() {
        List<Product> products = this.searchProductUseCase.execute();
        return products.stream().map(ProductPublicData::new).toList();
    }
}


