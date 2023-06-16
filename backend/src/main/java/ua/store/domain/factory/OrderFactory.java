package ua.store.domain.factory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ua.store.domain.model.Order;
import ua.store.domain.repository.OrderProductRepository;
import ua.store.web.dto.OrderDTORequest;
import ua.store.web.dto.OrderDTOResponse;
import ua.store.web.dto.OrderProductDTORequest;

@Component
@RequiredArgsConstructor
public class OrderFactory {

    private final OrderStatusFactory orderStatusFactory;
    private final OrderProductFactory orderProductFactory;
    private final OrderProductRepository orderProductRepository;

    public OrderDTOResponse toDto(Order order) {
        return OrderDTOResponse.builder()
                .id(order.getId())
                .timeOfOrder(order.getTimeOfOrder())
                .status(orderStatusFactory.toDto(order.getStatus()))
                .products(order.getProducts().stream().map(orderProductFactory::toDto).toList())
                .build();
    }

    public Order fromDto(OrderDTORequest order) {
        return Order.builder()
                .id(order.getId())
                .products(orderProductRepository.findAllById(order.getProducts()
                        .stream()
                        .map(OrderProductDTORequest::getProductId).toList()))
                .build();
    }
}
