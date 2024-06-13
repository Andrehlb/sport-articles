package br.com.rsfot.sportarticles.product;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProductResponse(
        Long id,
        String name,
        BigDecimal price,
        int quantity,
        String description,
        String urlImage,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        LocalDateTime createdAt,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        LocalDateTime updatedAt) {

    public ProductResponse(Product product) {
        this(product.getId(),
                product.getName(),
                product.getPrice(),
                product.getQuantity(),
                product.getDescription(),
                product.getUrlImage(),
                product.getCreatedAt(),
                product.getUpdatedAt());
    }
}
