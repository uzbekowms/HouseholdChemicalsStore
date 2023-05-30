package ua.store.domain.service;

import ua.store.domain.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category findById(int id);

    Category save(Category category);

    Category update(Category category, int id);

    boolean delete(int id);
}
