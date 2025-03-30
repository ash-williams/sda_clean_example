package com.example._CWK40Solution.clean.infrastructure.gateway;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface ProductRepository extends JpaRepository<ProductSchema, Long> {
    Optional<ProductSchema> findByName(String name);
}
