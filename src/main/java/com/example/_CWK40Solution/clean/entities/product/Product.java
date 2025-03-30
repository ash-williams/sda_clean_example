package com.example._CWK40Solution.clean.entities.product;


//Converted to use ValueObjects
//Product does not inherit from Abstract Entity
//Memberwise equality not usually necessary for Entities and just checking equality of Id does not mean these are the same (other values can be difference)
//Equality contracts moved to Value Types

public class Product {

    public ProductId getId() {
        return id;
    }

    private ProductId id;
    private ProductName name;

    Product() {
    }

    public Product(ProductName name) {
        this.id = ProductId.NONE;
        this.name = name;
    }

    public Product(ProductId id, ProductName name) {
        this.id = id;
        this.name = name;
    }



    public ProductName getName() {
        return name;
    }

    public void setName(ProductName name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",Product.class.getSimpleName(), id, name);
    }
}
