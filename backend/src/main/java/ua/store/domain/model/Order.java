package ua.store.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "order")
    private List<OrderProduct> products;

    @Column(name = "time_of_order")
    private Date timeOfOrder;

    @OneToOne
    @JoinColumn(name = "status_id")
    private OrderStatus status;
}
