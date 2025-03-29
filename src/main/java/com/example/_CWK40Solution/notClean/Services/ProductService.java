package com.example._CWK40Solution.notClean.Services;

import com.example._CWK40Solution.notClean.Domain.Product;
import com.example._CWK40Solution.notClean.Repositories.UncleanProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final UncleanProductRepository productRepository;

    ProductService(UncleanProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product addNewProduct(Product newProduct){
        return productRepository.save(newProduct);
    }
}
