package com.dmarqss.stockFlowWeb.models.products;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long ean;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private int amount;

    @Column(nullable = false)
    private String type;

    public Product(Long ean, String name, Double price, int amount, String type) {
        this.ean = ean;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.type = type;
    }
}
