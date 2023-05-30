package ua.store.domain.service;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ua.store.domain.model.Product;
import ua.store.web.dto.ProductDTORequest;
import ua.store.web.dto.ProductDTOResponse;

import java.util.List;


@Service
public interface ProductService {

    List<ProductDTOResponse> findAll();

    List<ProductDTOResponse> findAll(Pageable pageable);

    List<ProductDTOResponse> findAll(int categoryId, Pageable pageable);

    List<ProductDTOResponse> findAll(int categoryId, Pageable pageable, String search);

    List<ProductDTOResponse> findAll(Pageable pageable, String search);

    ProductDTOResponse findById(int id);

    ProductDTOResponse save(ProductDTORequest product);

    boolean deleteById(int id);

    ProductDTOResponse update(ProductDTORequest product, int id);
}
