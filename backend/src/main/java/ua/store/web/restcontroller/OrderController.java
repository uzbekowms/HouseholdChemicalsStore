package ua.store.web.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.store.domain.service.OrderService;
import ua.store.web.dto.OrderDTORequest;
import ua.store.web.dto.OrderDTOResponse;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<OrderDTOResponse> order(@RequestBody OrderDTORequest order) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(orderService.makeOrder(order));
    }

    @GetMapping()
    public ResponseEntity<List<OrderDTOResponse>> getAllOrders() {
        return ResponseEntity.ok(orderService.findAll());
    }
}
