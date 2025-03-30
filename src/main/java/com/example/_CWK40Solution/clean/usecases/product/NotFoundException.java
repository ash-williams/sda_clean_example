package com.example._CWK40Solution.clean.usecases.product;

public class NotFoundException extends Exception {

    public NotFoundException(long id) {
        super(String.format("Product %d not found", id));
    }
}
