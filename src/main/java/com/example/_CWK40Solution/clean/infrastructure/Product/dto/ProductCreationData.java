package com.example._CWK40Solution.clean.infrastructure.Product.dto;

import com.example._CWK40Solution.clean.infrastructure.Product.validation.UniqueProductName;
import com.example._CWK40Solution.clean.usecases.Product.dto.IProductCreation;
import jakarta.validation.constraints.NotBlank;

public record ProductCreationData(
        @UniqueProductName(message = "{Unique.product.name}")
        @NotBlank
        String name
)implements IProductCreation {}