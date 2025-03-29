package com.example._CWK40Solution.notClean.Repositories;

import com.example._CWK40Solution.notClean.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UncleanProductRepository extends JpaRepository<Product, Long> {
}
