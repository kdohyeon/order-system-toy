package com.example.onlinecoffeesandbox.service.customer;

import com.example.onlinecoffeesandbox.domain.Customer;
import com.example.onlinecoffeesandbox.domain.create.CreateCustomer;
import com.example.onlinecoffeesandbox.repository.customer.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public Customer newCustomer(CreateCustomer createCustomer) {
        Customer customer = Customer.newCustomer(createCustomer);
        return customerRepository.save(customer);
    }
}
