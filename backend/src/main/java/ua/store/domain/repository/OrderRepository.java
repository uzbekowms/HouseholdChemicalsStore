package ua.store.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.store.domain.model.Order;
import ua.store.domain.model.User;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findAllByOwner(User owner);


    @Query("update Order o set o.status.id = :statusId where o.id = :order")
    Order updateStatus(int order, int statusId);
}
