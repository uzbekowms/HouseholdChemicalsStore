package ua.store.domain.service;

import ua.store.web.dto.OrderDTORequest;
import ua.store.web.dto.OrderDTOResponse;
import ua.store.web.dto.Payment;

import java.util.List;

public interface OrderService {

    OrderDTOResponse makeOrder(OrderDTORequest order);

    List<OrderDTOResponse> findAll();
}
