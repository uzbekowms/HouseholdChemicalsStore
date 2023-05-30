package ua.store.domain.service;

import ua.store.domain.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category findById(int id);
}
