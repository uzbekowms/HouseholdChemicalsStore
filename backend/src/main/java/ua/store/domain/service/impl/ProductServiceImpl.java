package ua.store.domain.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ua.store.domain.factory.ProductFactory;
import ua.store.domain.model.Product;
import ua.store.domain.repository.ProductRepository;
import ua.store.domain.service.ProductService;
import ua.store.web.dto.ProductDTORequest;
import ua.store.web.dto.ProductDTOResponse;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ProductFactory factory;

    public ProductServiceImpl(ProductRepository repository, ProductFactory factory) {
        this.repository = repository;
        this.factory = factory;
    }

    @Override
    public List<ProductDTOResponse> findAll() {
        return repository.findAll().stream().map(factory::toDto).toList();
    }

    @Override
    public List<ProductDTOResponse> findAll(Pageable pageable) {
        return repository.findAll(pageable).stream().map(factory::toDto).toList();
    }

    @Override
    public List<ProductDTOResponse> findAll(int categoryId, Pageable pageable) {
        return repository.findAll(categoryId, pageable).stream().map(factory::toDto).toList();
    }

    @Override
    public List<ProductDTOResponse> findAll(int categoryId, Pageable pageable, String search) {
        return repository.findAll(categoryId, pageable, search).stream().map(factory::toDto).toList();
    }

    @Override
    public List<ProductDTOResponse> findAll(Pageable pageable, String search) {
        return repository.findAll(pageable, search).stream().map(factory::toDto).toList();
    }

    @Override
    public ProductDTOResponse findById(int id) {
        return factory.toDto(repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cant find Product with id: " + id)));
    }

    @Override
    public ProductDTOResponse save(ProductDTORequest product) {
        Product productToSave = factory.fromDto(product);

        return factory.toDto(repository.save(productToSave));
    }

    @Override
    public boolean deleteById(int id) {
        checkExists(id);

        repository.deleteById(id);
        return true;
    }

    @Override
    public ProductDTOResponse update(ProductDTORequest product, int id) {
        checkExists(id);

        Product productToUpdate = factory.fromDto(product);
        productToUpdate.setId(id);

        return factory.toDto(repository.save(productToUpdate));
    }

    private void checkExists(int id) {
        if (!repository.existsById(id))
            throw new EntityNotFoundException("Cant find Product with id: " + id);

    }


}
