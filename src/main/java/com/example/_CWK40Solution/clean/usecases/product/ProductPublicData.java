package com.example._CWK40Solution.clean.usecases.product;

import com.example._CWK40Solution.clean.entities.product.Product;

public record ProductPublicData(String id, String name){

    ProductPublicData(Product product)
    {
        this(product.getId().asString(), product.getName().asString());
    }
}
