package ua.store.web.dto;


import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
public class Payment {

    @NotBlank(message = "card number cannot be empty")
    private String cardNumber;
    @NotBlank(message = "cvv cannot be empty")
    private String cvv;
    @NotBlank(message = "Expiration date cannot be empty")
    @Future(message = "Card has expired")
    private Date expirationDate;


}
