package com.example.onlinecoffeesandbox.service.order;

import com.example.onlinecoffeesandbox.domain.Order;
import com.example.onlinecoffeesandbox.domain.create.CreateOrder;
import com.example.onlinecoffeesandbox.repository.order.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void order(CreateOrder createOrder) {
        Order order = Order.newOrder(createOrder);
        orderRepository.save(order);
    }
}
