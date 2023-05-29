package ua.store.web.dto;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
public class ProductDTOResponse extends ProductDTO {

    private String imagePath;
}
