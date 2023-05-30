package ua.store.web.restcontroller;

import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.store.domain.service.ProductService;
import ua.store.web.dto.ProductDTORequest;
import ua.store.web.dto.ProductDTOResponse;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTOResponse>> getAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping(params = {"page", "count"})
    public ResponseEntity<List<ProductDTOResponse>> getAllProductsByPage(@PathVariable(value = "page") int page, @PathVariable(value = "count") int count) {
        return ResponseEntity.ok(productService.findAll(PageRequest.of(page, count)));
    }

    @PostMapping
    public ResponseEntity<ProductDTOResponse> addProduct(@RequestBody ProductDTORequest product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTOResponse> updateProduct(@RequestBody ProductDTORequest product, @PathVariable int id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.update(product, id));
    }
}
