package br.com.rsfot.sportarticles.product;

public record NewProductResponse(
        Long id,
        String name,
        int quantity,
        String description) {

    public NewProductResponse(Product product) {
        this(product.getId(),
                product.getName(),
                product.getQuantity(),
                product.getDescription());
    }
}
