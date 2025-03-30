package com.example._CWK40Solution.clean.infrastructure.gateway;

import com.example._CWK40Solution.clean.entities.product.Product;
import com.example._CWK40Solution.clean.entities.product.ProductId;
import com.example._CWK40Solution.clean.entities.product.ProductName;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidIdException;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidNameException;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Products")
class ProductSchema  {

    public static Product toProduct(ProductSchema schema) {
        try {
            return new Product(new ProductId(schema.getId()), new ProductName(schema.name));
        } catch (InvalidIdException | InvalidNameException e) {
            throw new RuntimeException(e);
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @UniqueProductName(message = "{Unique.product.name}")
    @NotBlank
    @Column(length = ProductName.MAX_LENGTH, unique = true)
    private String name;

    //required
    private ProductSchema()
    {

    }

    //required
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductSchema that = (ProductSchema) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public ProductSchema(Product product) {
        this.id =product.getId().asLong();
        this.name = product.getName().asString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
