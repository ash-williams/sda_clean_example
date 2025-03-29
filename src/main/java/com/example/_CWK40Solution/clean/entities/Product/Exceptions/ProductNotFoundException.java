package com.example._CWK40Solution.clean.entities.Product.Exceptions;

public class ProductNotFoundException extends Exception {

    public ProductNotFoundException() {
        super("Product not found!");
    }
}
