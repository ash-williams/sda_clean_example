package com.example._CWK40Solution.clean.infrastructure.Product.dto;

import com.example._CWK40Solution.clean.entities.Product.Model.Product;
import com.example._CWK40Solution.clean.infrastructure.Product.validation.UniqueProductName;
import com.example._CWK40Solution.clean.usecases.Product.dto.IProductCreation;

import com.example._CWK40Solution.clean.usecases.Product.dto.IProductPublicData;
import jakarta.validation.constraints.NotBlank;

public record ProductPublicData(
        String id,
        String name
) implements IProductPublicData {
        public ProductPublicData(Product product) {
                this(
                        product.getId().toString(),
                        product.getName()
                );
        }
}


