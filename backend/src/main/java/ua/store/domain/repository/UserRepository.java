package ua.store.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.store.domain.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
