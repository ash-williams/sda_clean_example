package com.example._CWK40Solution.clean.entities.Product.Model;

import com.example._CWK40Solution.clean.entities.AbstractEntity;

public class Product extends AbstractEntity<Long> {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
