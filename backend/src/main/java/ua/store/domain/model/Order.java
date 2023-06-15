package ua.store.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
