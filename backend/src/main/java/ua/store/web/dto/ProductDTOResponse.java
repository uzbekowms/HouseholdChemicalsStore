package ua.store.web.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.store.domain.model.Category;
import ua.store.domain.model.Review;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTOResponse {
    private int id;
    private String name;
    private String description;
    private float price;
    private CategoryDTO category;
    private String imagePath;
    private boolean disabled;
    private List<ReviewDTO> reviews;
}
