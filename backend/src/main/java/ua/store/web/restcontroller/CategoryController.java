package ua.store.web.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.store.domain.model.Category;
import ua.store.domain.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin("*")

public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(categoryService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable int id) {
        return ResponseEntity.ok(categoryService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.save(category));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category, @PathVariable int id) {
        return ResponseEntity.ok(categoryService.update(category, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable int id) {
        return ResponseEntity.ok(categoryService.delete(id) ? "Category with id: " + " has been deleted" : "Category not deleted");
    }
}
