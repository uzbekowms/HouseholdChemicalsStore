package ua.store.domain.service.impl;

import org.springframework.stereotype.Service;
import ua.store.domain.factory.OrderFactory;
import ua.store.domain.model.Order;
import ua.store.domain.repository.OrderRepository;
import ua.store.domain.service.OrderService;
import ua.store.web.dto.OrderDTORequest;
import ua.store.web.dto.OrderDTOResponse;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderFactory orderFactory;

    public OrderServiceImpl(OrderRepository orderRepository, OrderFactory orderFactory) {
        this.orderRepository = orderRepository;
        this.orderFactory = orderFactory;
    }

    @Override
    public OrderDTOResponse makeOrder(OrderDTORequest order) {
        Order orderToSave = orderFactory.fromDto(order);
        return orderFactory.toDto(orderRepository.save(orderToSave));
    }

    @Override
    public List<OrderDTOResponse> findAll() {
        return orderRepository.findAll().stream().map(orderFactory::toDto).toList();
    }
}
