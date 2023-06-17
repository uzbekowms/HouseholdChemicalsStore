package ua.store.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTORequest {
    private int id;
    @NotBlank(message = "Product id cannot be empty")
    private int productId;
    @NotBlank(message = "Text cannot be empty")
    private String text;
    @NotBlank(message = "Jwt cannot be empty")
    private String jwt;
}
