package ua.store.domain.factory;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import ua.store.domain.jwt.JwtService;
import ua.store.domain.model.Order;
import ua.store.domain.model.OrderStatus;
import ua.store.domain.repository.OrderProductRepository;
import ua.store.domain.repository.OrderRepository;
import ua.store.domain.repository.OrderStatusRepository;
import ua.store.domain.repository.UserRepository;
import ua.store.web.dto.OrderDTORequest;
import ua.store.web.dto.OrderDTOResponse;
import ua.store.web.dto.OrderProductDTORequest;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class OrderFactory {

    private final OrderStatusFactory orderStatusFactory;
    private final OrderStatusRepository orderStatusRepository;
    private final OrderProductFactory orderProductFactory;
    private final OrderProductRepository orderProductRepository;
    private final UserRepository userRepository;
    private final JwtService jwtService;

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
                .timeOfOrder(new Date())
                .owner(userRepository.findByEmail(jwtService.extractUsername(order.getJwt())).orElseThrow())
                .status(orderStatusRepository.findByName("Ordered"))
                .products(orderProductRepository.findAllById(order.getProducts()
                        .stream()
                        .map(OrderProductDTORequest::getProductId).toList()))
                .build();
    }
}
