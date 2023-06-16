package ua.store.domain.service.impl;

import com.liqpay.LiqPay;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ua.store.domain.model.Order;
import ua.store.domain.model.OrderProduct;
import ua.store.domain.service.PaymentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Value("${liqpay.public}")
    private String publicKey;
    @Value("${liqpay.private}")
    private String privateKey;

    @Override
    public Map<String, Object> payment(Order order) throws Exception {
        Map<String, String> params = new HashMap<>();

        params.put("amount", amount(order.getProducts()));
        params.put("currency", "UAH");
        params.put("sandbox", "1");
        LiqPay liqPay = new LiqPay(publicKey, privateKey);
        System.out.println(liqPay.api("request", params));
        return liqPay.api("/request", params);
    }

    private String amount(List<OrderProduct> products) {
        float amount = 0;

        for (OrderProduct orderProduct : products) {
            amount += orderProduct.getProduct().getPrice() * orderProduct.getCount();
        }
        return String.valueOf(amount);
    }
}
