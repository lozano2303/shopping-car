package com.shopping.cart.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "price", precision = 7, scale = 2, nullable = false)
    private Double price;

    @Column(name = "topics", length = 100)
    private String topics;

    @Column(name = "available_quantity", nullable = false)
    private Integer availableQuantity;

    public Product() {
    }

    public Product(Integer productId, String name, Double price, String topics, Integer availableQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.topics = topics;
        this.availableQuantity = availableQuantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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