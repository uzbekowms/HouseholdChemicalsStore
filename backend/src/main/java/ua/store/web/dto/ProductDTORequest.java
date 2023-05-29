package ua.store.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.web.multipart.MultipartFile;

@EqualsAndHashCode(callSuper = true)
@Data
public class ProductDTORequest extends ProductDTO {
    @NotBlank(message = "Image cannot be blank")
    private MultipartFile image;

    private String imageName;
}
