package br.com.rsfot.sportarticles.product;

import br.com.rsfot.sportarticles.error.handler.NotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    @PostMapping("/product")
    public ResponseEntity<ProductResponse> createProduct(@Valid @RequestBody NewProductRequest newProductRequest) {
        Product newProduct = newProductRequest.toModel();
        productRepository.save(newProduct);
        return ResponseEntity.ok(new ProductResponse(newProduct));
    }

    @Transactional
    @PutMapping("/product/{id}")
    public ResponseEntity<ProductResponse> updateProduct(@PathVariable("id") Long id, @Valid @RequestBody UpdateProductRequest updateProductRequest) {
        Product productToBeUpdated = productRepository.findById(id).orElseThrow(() -> new NotFoundException("Product not found with id: " + id));
        updateProductRequest.updateProduct(productToBeUpdated);
        productRepository.save(productToBeUpdated);
        return ResponseEntity.ok(new ProductResponse(productToBeUpdated));
    }

    @Transactional
    @GetMapping("/product")
    public ResponseEntity<List<ProductResponse>> listProducts() {
        List<Product> products = productRepository.findAll();
        return ResponseEntity.ok(products.stream().map(ProductResponse::new).toList());
    }
}
