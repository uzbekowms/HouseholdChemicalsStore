package ua.store.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ua.store.domain.model.Order;
import ua.store.domain.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select u.orders from User u where u.id = :id")
    List<Order> findAllUserOrders(int id);
}
