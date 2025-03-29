package com.example._CWK40Solution.notClean.RESTControllers;

import com.example._CWK40Solution.notClean.Domain.Product;
import com.example._CWK40Solution.notClean.Services.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    private final ProductService productService;

    ProductsController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/unclean/products")
    public Product addNewProduct(@RequestBody Product newProduct){
        return productService.addNewProduct(newProduct);
    }

}
