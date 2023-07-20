package com.stage_0.product_api.product_api.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    // Add other endpoints and logic as needed
    @RequestMapping("/product")
    public List<String> getProduct() {
        return Arrays.asList("Product 1", "Product 2", "Product 3");
    }
}
