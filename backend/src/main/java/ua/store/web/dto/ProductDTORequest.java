package ua.store.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import ua.store.domain.model.Review;

import java.util.List;

@Data
public class ProductDTORequest {
    @Null
    private int id;
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Description cannot be blank")
    private String description;
    @NotBlank(message = "Price cannot be blank")
    private float price;
    @NotBlank(message = "Category cannot be blank")
    private int categoryId;

    private boolean disabled;

    private List<Review> reviews;
    @NotBlank(message = "Image cannot be blank")
    private MultipartFile image;

    private String imageName;
}
