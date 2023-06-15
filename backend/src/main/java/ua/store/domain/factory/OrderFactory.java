package ua.store.domain.factory;

import org.springframework.stereotype.Component;
import ua.store.domain.model.Order;
import ua.store.web.dto.OrderDTO;

@Component
public class OrderFactory {

    private final OrderStatusFactory orderStatusFactory;
    private final OrderProductFactory orderProductFactory;

    public OrderFactory(OrderStatusFactory orderStatusFactory, OrderProductFactory orderProductFactory) {
        this.orderStatusFactory = orderStatusFactory;
        this.orderProductFactory = orderProductFactory;
    }

    public OrderDTO toDto(Order order) {
        return OrderDTO.builder()
                .id(order.getId())
                .timeOfOrder(order.getTimeOfOrder())
                .status(orderStatusFactory.toDto(order.getStatus()))
                .products(order.getProducts().stream().map(orderProductFactory::toDto).toList())
                .build();
    }

    public Order fromDto(OrderDTO){

    }
}
