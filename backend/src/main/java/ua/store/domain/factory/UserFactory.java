package ua.store.domain.factory;

import org.springframework.stereotype.Component;
import ua.store.domain.model.User;
import ua.store.web.dto.UserDTOResponse;

@Component
public class UserFactory {


    public UserDTOResponse toDto(User user){
        return UserDTOResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .build();
    }
}