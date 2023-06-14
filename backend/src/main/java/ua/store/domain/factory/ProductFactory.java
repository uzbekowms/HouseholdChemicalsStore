package ua.store.domain.factory;

import org.springframework.stereotype.Service;
import ua.store.domain.model.Product;
import ua.store.domain.service.CategoryService;
import ua.store.web.dto.ProductDTORequest;

@Service
public class ProductFactory {

    private final CategoryService categoryService;

    public ProductFactory(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public Product fromDto(ProductDTORequest productDTO) {
        return Product.builder()
                .id(productDTO.getId())
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .price(productDTO.getPrice())
                .category(categoryService.findById(productDTO.getCategoryId()))
                .imagePath(productDTO.getImagePath())
                .disabled(productDTO.isDisabled())
                .build();
    }

   /* public ProductDTOResponse toDto(Product product) {
        ProductDTOResponse dtoResponse = new ProductDTOResponse();
        dtoResponse.setId(product.getId());
        dtoResponse.setName(product.getName());
        dtoResponse.setDescription(product.getDescription());
        dtoResponse.setCategory(product.getCategory());
        dtoResponse.setDisabled(product.isDisabled());
        dtoResponse.setImagePath(product.getImagePath());
        dtoResponse.setPrice(product.getPrice());
        dtoResponse.setReviews(product.getReviews());
        return dtoResponse;
    }*/
}
