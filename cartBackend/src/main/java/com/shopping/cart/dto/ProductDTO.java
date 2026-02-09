package com.shopping.cart.dto;

public class ProductDTO {

    private String name;
    private Double price;
    private String topics;
    private Integer availableQuantity;

    public ProductDTO() {
    }

    public ProductDTO(String name, Double price, String topics, Integer availableQuantity) {
        this.name = name;
        this.price = price;
        this.topics = topics;
        this.availableQuantity = availableQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
