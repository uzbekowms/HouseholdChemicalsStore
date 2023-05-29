package ua.store.domain.service;

import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public interface ProductService {

    void findAll();
    void findAll(Pageable pageable);
    void findByCategory(int categoryId);
}
