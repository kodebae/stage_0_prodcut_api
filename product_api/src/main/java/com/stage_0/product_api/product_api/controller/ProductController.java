package com.stage_0.product_api.product_api.controller;

import com.stage_0.product_api.model.Product;
import com.stage_0.product_api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        // Add logic to handle the new product creation and return the saved product
        return product;
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable String id) {
        // Add logic to retrieve the product by ID and return it
        // Replace the below example with actual implementation:
        Product product = new Product();
        product.setId(id);
        product.setName("Sample Product");
        product.setBigIdea("Sample Big Idea");
        // Add other properties as needed
        return product;
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
        // Add logic to update the product with the given ID and return the updated product
        return product;
    }

    // Add other endpoints and logic here
}
