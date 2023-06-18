package ua.store.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTORequest {
    private int id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Description cannot be blank")
    private String description;
    @NotBlank(message = "Price cannot be blank")
    private float price;
    @NotEmpty(message = "Category cannot be blank")
    private int categoryId;
    private boolean disabled;
    @NotBlank(message = "Image cannot be blank")
    private String imagePath;
}
