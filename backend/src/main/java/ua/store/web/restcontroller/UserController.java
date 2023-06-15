package ua.store.web.restcontroller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.store.domain.service.UserService;
import ua.store.web.dto.UserDTOResponse;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping
    public ResponseEntity<UserDTOResponse> getUser(HttpServletRequest request){
        return ResponseEntity.ok(userService.getUser(request));
    }

}
