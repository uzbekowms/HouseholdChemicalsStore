package ua.store.web.dto;


import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class Payment {

    @NotBlank(message = "card number cannot be empty")
    @Size(min = 16, max = 16, message = "Card number is invalid")
    private String cardNumber;
    @NotBlank(message = "cvv cannot be empty")
    @Size(min = 3, max = 3, message = "Cvv number is invalid")
    private String cvv;
    @NotBlank(message = "Expiration date cannot be empty")
    @Future(message = "Card has expired")
    private Date expirationDate;


}
