package ua.store.domain.service;

import jakarta.servlet.http.HttpServletRequest;
import ua.store.web.dto.UserDTOResponse;
import ua.store.web.dto.auth.RegisterRequest;


public interface UserService {

    UserDTOResponse getUser(HttpServletRequest request);

    UserDTOResponse update(RegisterRequest request, int id);
}
