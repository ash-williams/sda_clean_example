package com.example._CWK40Solution.clean.infrastructure.config.web;

import com.example._CWK40Solution.clean.entities.Product.Gateway.ProductGateway;
import com.example._CWK40Solution.clean.infrastructure.Product.gateway.ProductDatabaseGateway;
import com.example._CWK40Solution.clean.infrastructure.config.db.repositories.ProductRepository;
import com.example._CWK40Solution.clean.usecases.Product.CreateProductUseCase;
import com.example._CWK40Solution.clean.usecases.Product.GetProductUseCase;
import com.example._CWK40Solution.clean.usecases.Product.SearchProductUseCase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ResourceBundle;

@Configuration
public class MvcConfig {

//    @Bean
//    public ResourceBundle messageBundle() {
//        return ResourceBundle.getBundle("ValidationMessages");
//    }

    @Bean
    public CreateProductUseCase createProductUseCase(ProductRepository productRepository) {
        ProductGateway productGateway = new ProductDatabaseGateway(productRepository);
        return new CreateProductUseCase(productGateway);
    }

    @Bean
    public GetProductUseCase getProductUseCase(ProductRepository productRepository) {
        ProductGateway productGateway = new ProductDatabaseGateway(productRepository);
        return new GetProductUseCase(productGateway);
    }

    @Bean
    public SearchProductUseCase searchProductUseCase(ProductRepository productRepository) {
        ProductGateway productGateway = new ProductDatabaseGateway(productRepository);
        return new SearchProductUseCase(productGateway);
    }
}
