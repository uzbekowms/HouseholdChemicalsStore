package ua.store.domain.service;

import ua.store.domain.model.Order;

import java.util.Map;

public interface PaymentService {

    Map<String, Object> payment(Order order) throws Exception;

}
