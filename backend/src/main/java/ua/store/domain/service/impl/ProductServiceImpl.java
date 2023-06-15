package ua.store.domain.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ua.store.domain.factory.ProductFactory;
import ua.store.domain.model.Product;
import ua.store.domain.repository.ProductRepository;
import ua.store.domain.service.ImageService;
import ua.store.domain.service.ProductService;
import ua.store.web.dto.ProductDTORequest;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ProductFactory factory;
    private final ImageService imageService;

    public ProductServiceImpl(ProductRepository repository, ProductFactory factory, ImageService imageService) {
        this.repository = repository;
        this.factory = factory;
        this.imageService = imageService;
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }


    @Override
    public List<Product> findAll(Pageable pageable, int categoryId, String search) {
        return repository.findAll(pageable, categoryId, search).stream().toList();
    }

    @Override
    public List<Product> findAll(Pageable pageable, String search) {
        return repository.findAll(pageable, search).stream().toList();
    }


    @Override
    public Product findById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cant find Product with id: " + id));
    }

    @Override
    public Product save(ProductDTORequest product) {
        Product productToSave = factory.fromDto(product);

        return repository.save(productToSave);
    }

    @Override
    public boolean deleteById(int id) {
        checkExists(id);

        repository.deleteById(id);
        return true;
    }

    @Override
    public Product update(ProductDTORequest product, int id) {
        checkExists(id);
        Product productToUpdate = factory.fromDto(product);
        productToUpdate.setId(id);

        return repository.save(productToUpdate);
    }

    @Override
    public boolean disable(int id) {
        checkExists(id);

        Product product = repository.findById(id).orElseThrow();
        product.setDisabled(true);
        repository.save(product);
        return true;
    }

    private void checkExists(int id) {
        if (!repository.existsById(id))
            throw new EntityNotFoundException("Cant find Product with id: " + id);
    }
}
