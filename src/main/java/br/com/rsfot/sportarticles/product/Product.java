package br.com.rsfot.sportarticles.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
    @Column(name = "url_image", columnDefinition = "TEXT")
    private String urlImage;
    @Column(nullable = false, columnDefinition = "TIMESTAMP", name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
    @Column(columnDefinition = "TIMESTAMP", name = "updated_at")
    private LocalDateTime updatedAt;

    /***
     * @deprecated hibernate eyes only
     */
    @Deprecated
    public Product() {
    }

    public Product(String name, BigDecimal price, int quantity, String description, String urlImage) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.urlImage = urlImage;
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

    public String getUrlImage() {
        return urlImage;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(@Positive int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
