package ua.store.domain.service;

import jakarta.servlet.http.HttpServletRequest;
import ua.store.web.dto.UserDTOResponse;


public interface UserService {

    UserDTOResponse getUser(HttpServletRequest request);
}
