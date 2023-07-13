package com.stage_0.product_api.product_api.controller;

import com.stage_0.product_api.model.Product;
import com.stage_0.product_api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Optional;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/product")
    public Product getProduct(@RequestParam Integer id){
        ProductController productService = null;
        Optional<Product> product = Optional.ofNullable(productService.getProduct(id));
        return (Product) product.orElse(null);
    }
}
