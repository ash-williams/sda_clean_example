package com.example._CWK40Solution.clean.infrastructure.gateway;

import com.example._CWK40Solution.clean.entities.product.ProductGateway;
import com.example._CWK40Solution.clean.usecases.product.CreateProductUseCase;
import com.example._CWK40Solution.clean.usecases.product.GetProductUseCase;
import com.example._CWK40Solution.clean.usecases.product.SearchProductUseCase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DatabaseConfiguration {

    @Bean
    CreateProductUseCase createProductUseCase(ProductRepository productRepository) {
        ProductGateway productGateway = new ProductDatabaseGateway(productRepository);
        return new CreateProductUseCase(productGateway);
    }

    @Bean
    GetProductUseCase getProductUseCase(ProductRepository productRepository) {
        ProductGateway productGateway = new ProductDatabaseGateway(productRepository);
        return new GetProductUseCase(productGateway);
    }

    @Bean
    SearchProductUseCase searchProductUseCase(ProductRepository productRepository) {
        ProductGateway productGateway = new ProductDatabaseGateway(productRepository);
        return new SearchProductUseCase(productGateway);
    }
}
