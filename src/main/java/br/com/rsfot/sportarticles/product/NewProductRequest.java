package br.com.rsfot.sportarticles.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record NewProductRequest(
        @NotNull
        String name,
        @NotNull
        BigDecimal price,
        @NotNull
        int quantity,
        @NotNull
        @Size(max = 500)
        String description) {

        public Product toModel() {
                return new Product(name,  price, quantity, description);
        }
}
