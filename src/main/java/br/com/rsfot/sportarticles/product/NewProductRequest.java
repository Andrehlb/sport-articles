package br.com.rsfot.sportarticles.product;

import br.com.rsfot.sportarticles.validation.UniqueValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record NewProductRequest(
        @NotNull
        @UniqueValue(domainClass = Product.class, fieldName = "name")
        String name,
        @NotNull
        BigDecimal price,
        @NotNull
        int quantity,
        @NotNull
        @Size(max = 500)
        String description,
        String urlImage) {

    public Product toModel() {
        return new Product(name, price, quantity, description, urlImage);
    }
}
