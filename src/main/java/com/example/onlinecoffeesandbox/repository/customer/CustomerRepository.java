package com.example.onlinecoffeesandbox.repository.customer;

import com.example.onlinecoffeesandbox.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
}
