package br.com.rsfot.sportarticles.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.IDENTITY;

@Table(name = "product")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private BigDecimal price;
    @Positive
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false, length = 500)
    private String description;

    /***
     * @deprecated hibernate eyes only
     */
    @Deprecated
    public Product() {
    }

    public Product(String name, BigDecimal price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }
}
