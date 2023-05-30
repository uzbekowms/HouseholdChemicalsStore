package ua.store.web.restcontroller;

import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.store.domain.model.Product;
import ua.store.domain.service.ProductService;
import ua.store.web.dto.ProductDTORequest;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping(params = {"page", "count"})
    public ResponseEntity<List<Product>> getAllProductsByPage(@PathVariable(value = "page") int page, @PathVariable(value = "count") int count) {
        return ResponseEntity.ok(productService.findAll(PageRequest.of(page, count)));
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@ModelAttribute ProductDTORequest product) {
        System.out.println(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@ModelAttribute ProductDTORequest product, @PathVariable int id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.update(product, id));
    }

    @DeleteMapping("/{id}/disable")
    public ResponseEntity<String> updateProduct(@PathVariable int id) {
        return ResponseEntity.ok().body(productService.disable(id) ? "Product with id: " + id + " has been deleted" : "Product not deleted");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
        return ResponseEntity.ok().body(productService.deleteById(id) ? "Product with id: " + id + " has been deleted" : "Product not deleted");
    }
}
