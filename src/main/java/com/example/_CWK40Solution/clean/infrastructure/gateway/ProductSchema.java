package com.example._CWK40Solution.clean.infrastructure.gateway;

import com.example._CWK40Solution.clean.entities.product.Product;
import com.example._CWK40Solution.clean.entities.product.ProductId;
import com.example._CWK40Solution.clean.entities.product.ProductName;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidIdException;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidNameException;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Products")
class ProductSchema extends AbstractEntitySchema<Long> {

    public static Product toProduct(ProductSchema schema) {
        try {
            return new Product(new ProductId(schema.getId()), new ProductName(schema.name));
        } catch (InvalidIdException | InvalidNameException e) {
            throw new RuntimeException(e);
        }
    }

    @UniqueProductName(message = "{Unique.product.name}")
    @NotBlank
    @Column(length = ProductName.MAX_LENGTH, unique = true)
    private String name;


    public ProductSchema(Product product) {
        this.setId(product.getId().asLong());
        this.name = product.getName().asString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
