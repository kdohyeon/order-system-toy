package com.example.onlinecoffeesandbox.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Table(name = "products")
public class Product {
    @Id
    private String productId;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private BigDecimal price;
}
