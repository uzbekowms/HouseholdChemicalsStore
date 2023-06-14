package ua.store.domain.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import ua.store.domain.model.Category;
import ua.store.domain.repository.CategoryRepository;
import ua.store.domain.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Cannot find Category with id: " + id));
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category update(Category category, int id) {
        checkExists(id);
        category.setId(id);
        return categoryRepository.save(category);
    }

    @Override
    public boolean delete(int id) {
        checkExists(id);

        categoryRepository.deleteById(id);
        return true;
    }

    private void checkExists(int id) {
        if (!categoryRepository.existsById(id))
            throw new EntityNotFoundException("Not found Category with id: " + id);
    }
}
