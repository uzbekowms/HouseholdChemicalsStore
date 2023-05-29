package ua.store.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import ua.store.domain.model.Category;
import ua.store.domain.model.Review;

import java.util.List;

@Getter
@Setter
public abstract class ProductDTO {

    private int id;
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Description cannot be blank")
    private String description;
    @NotBlank(message = "Price cannot be blank")
    private float price;
    @NotBlank(message = "Category cannot be blank")
    private Category category;

    private boolean disabled;

    private List<Review> reviews;
}
