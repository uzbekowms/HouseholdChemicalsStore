package ua.store.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.store.domain.factory.OrderFactory;
import ua.store.domain.model.Order;
import ua.store.domain.repository.OrderRepository;
import ua.store.domain.service.OrderService;
import ua.store.domain.service.PaymentService;
import ua.store.web.dto.OrderDTORequest;
import ua.store.web.dto.OrderDTOResponse;
import ua.store.web.dto.Payment;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderFactory orderFactory;
    private final PaymentService paymentService;


    @Override
    public OrderDTOResponse makeOrder(OrderDTORequest order) {
        Order orderToSave = orderFactory.fromDto(order);
        paymentService.payment(orderToSave, order.getPayment());
        return orderFactory.toDto(orderRepository.save(orderToSave));
    }

    @Override
    public List<OrderDTOResponse> findAll() {
        return orderRepository.findAll().stream().map(orderFactory::toDto).toList();
    }
}
