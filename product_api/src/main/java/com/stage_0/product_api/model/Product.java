package com.stage_0.product_api.model;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private String bigIdea;
    private String businessCase;


    // Empty constructor
    public Product() {
    }

    // Constructor with parameters
    public Product(UUID id, String name, String bigIdea, String businessCase) {
        this.id = id;
        this.name = name;
        this.bigIdea = bigIdea;
        this.businessCase = businessCase;
    }

    public Product(int i, String productBusNames) {
    }

    // Getters and Setters for all properties

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBigIdea() {
        return bigIdea;
    }

    public void setBigIdea(String bigIdea) {
        this.bigIdea = bigIdea;
    }

    public String getBusinessCase() {
        return businessCase;
    }

    public void setBusinessCase(String businessCase) {
        this.businessCase = businessCase;
    }


    // Add other getters and setters if you have additional properties

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bigIdea='" + bigIdea + '\'' +
                ", businessCase='" + businessCase + '\'' +
                '}';
    }
}

