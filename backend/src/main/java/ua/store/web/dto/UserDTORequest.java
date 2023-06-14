package ua.store.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDTORequest {
    private int id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Surname cannot be blank")
    private String surname;
    @NotBlank(message = "Patronymic cannot be blank")
    private String patronymic;
    @NotBlank(message = "Phone cannot be blank")
    private String phone;
    @NotBlank(message = "Email cannot be blank")
    private String email;
    @NotBlank(message = "Password cannot be blank")
    private String password;
}
