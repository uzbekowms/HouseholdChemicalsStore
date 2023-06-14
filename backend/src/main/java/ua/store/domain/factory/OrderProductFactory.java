package ua.store.domain.factory;

import org.springframework.stereotype.Component;
import ua.store.domain.model.OrderProduct;
import ua.store.domain.repository.OrderRepository;
import ua.store.domain.repository.ProductRepository;
import ua.store.web.dto.OrderProductDTORequest;
import ua.store.web.dto.OrderProductResponse;

@Component
public class OrderProductFactory {
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    private final ProductFactory productFactory;

    public OrderProductFactory(ProductRepository productRepository, OrderRepository orderRepository, ProductFactory productFactory) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
        this.productFactory = productFactory;
    }

    private OrderProduct fromDto(OrderProductDTORequest productDTO) {
        return OrderProduct.builder()
                .id(productDTO.getId())
                .count(productDTO.getCount())
                .product(productRepository.findById(productDTO.getProductId()).orElseThrow())
                .order(orderRepository.findById(productDTO.getOrderId()).orElseThrow())
                .build();
    }

    private OrderProductResponse toDto(OrderProduct orderProduct){
        return OrderProductResponse.builder()
                .product(productFactory.)
                .build();
    }
}
