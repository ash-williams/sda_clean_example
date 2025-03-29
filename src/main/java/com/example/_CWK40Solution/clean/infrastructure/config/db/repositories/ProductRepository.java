package com.example._CWK40Solution.clean.infrastructure.config.db.repositories;

import com.example._CWK40Solution.clean.infrastructure.config.db.schemas.ProductSchema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductSchema, Long> {
    Optional<ProductSchema> findByName(String name);
}