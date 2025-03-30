package com.example._CWK40Solution.clean.entities.product.exceptions;

public class InvalidIdException extends Exception {
    public InvalidIdException(long id) {
        super(String.format("%d", id));
    }
}
