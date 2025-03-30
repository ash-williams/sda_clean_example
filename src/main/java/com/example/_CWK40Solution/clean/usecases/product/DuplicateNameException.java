package com.example._CWK40Solution.clean.usecases.product;

import com.example._CWK40Solution.clean.entities.product.ProductName;

public class DuplicateNameException extends Exception {

    public DuplicateNameException(ProductName name) {
        super(String.format("Product name %s not unique", name));
    }
}
