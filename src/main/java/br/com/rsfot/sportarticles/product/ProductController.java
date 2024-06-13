package br.com.rsfot.sportarticles.product;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    @PostMapping("/product")
    public ResponseEntity createProduct(@Valid @RequestBody NewProductRequest newProductRequest) {
        Product newProduct = newProductRequest.toModel();
        productRepository.save(newProduct);
        return ResponseEntity.ok(new NewProductResponse(newProduct));
    }
}
