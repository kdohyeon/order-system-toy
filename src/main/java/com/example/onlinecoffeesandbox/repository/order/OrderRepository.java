package com.example.onlinecoffeesandbox.repository.order;

import com.example.onlinecoffeesandbox.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
