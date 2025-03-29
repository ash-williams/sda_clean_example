package com.example._CWK40Solution.clean.infrastructure.Product.validation;

import com.example._CWK40Solution.clean.infrastructure.config.db.repositories.ProductRepository;
import com.example._CWK40Solution.clean.infrastructure.config.db.schemas.ProductSchema;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UniqueProductNameValidator implements ConstraintValidator<UniqueProductName, String> {
    @Autowired
    private ProductRepository repository;

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context){
        if (repository != null) {
            Optional<ProductSchema> usuario = repository.findByName(name);
            return usuario.isEmpty();
        }

        return true;
    }
}
