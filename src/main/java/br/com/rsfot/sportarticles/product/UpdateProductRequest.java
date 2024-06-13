package br.com.rsfot.sportarticles.product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record UpdateProductRequest(
        String name,
        BigDecimal price,
        int quantity,
        String description,
        String urlImage) {

    public void updateProduct(Product product) {
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
        product.setDescription(description);
        product.setUrlImage(urlImage);
        product.setUpdatedAt(LocalDateTime.now());
    }

}


