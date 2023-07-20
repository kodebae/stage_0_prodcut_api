package com.stage_0.product_api.service;

import com.stage_0.product_api.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> productList;

    public ProductService() {
        productList = new ArrayList<>();

        Product product1 = new Product(1, "Cafe Shop");
        Product product2 = new Product(2, "Grocery");
        Product product3 = new Product(3, "Gas Station");
        Product product4 = new Product(4, "Hotel");
        Product product5 = new Product(5, "Bar");
        Product product6 = new Product(6, "Shop");

        productList.addAll(Arrays.asList(product1, product2, product3, product4, product5, product6));
    }
}