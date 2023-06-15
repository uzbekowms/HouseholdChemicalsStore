package ua.store.domain.factory;

import org.springframework.stereotype.Service;
import ua.store.domain.model.Product;
import ua.store.domain.repository.CategoryRepository;
import ua.store.web.dto.ProductDTORequest;

@Service
public class ProductFactory {

    private final CategoryRepository categoryRepository;

    public ProductFactory(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Product fromDto(ProductDTORequest productDTO) {
        return Product.builder()
                .id(productDTO.getId())
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .price(productDTO.getPrice())
                .category(categoryRepository.findById(productDTO.getCategoryId()).orElseThrow())
                .imagePath(productDTO.getImagePath())
                .disabled(productDTO.isDisabled())
                .build();
    }

    public ProductDTORequest toDto(Product product) {
        return ProductDTORequest.builder()
                .id(product.getId())
                .categoryId(product.getCategory().getId())
                .description(product.getDescription())
                .disabled(product.isDisabled())
                .imagePath(product.getImagePath())
                .price(product.getPrice())
                .name(product.getName())
                .build();
    }
}
