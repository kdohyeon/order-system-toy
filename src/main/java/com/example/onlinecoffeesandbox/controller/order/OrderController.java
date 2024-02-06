package com.example.onlinecoffeesandbox.controller.order;

import com.example.onlinecoffeesandbox.controller.response.Response;
import com.example.onlinecoffeesandbox.domain.create.CreateOrder;
import com.example.onlinecoffeesandbox.service.order.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {
    private final OrderService orderService;

    OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/v1/order")
    public Response<Integer> newOrder() {
        HashMap<Integer, Integer> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1, 10);
        orderService.order(CreateOrder.builder()
                .customerId(1)
                .quantityByProduct(objectObjectHashMap)
                .build());

        return Response.ok(1000);
    }
}
