package com.example.onlinecoffeesandbox.domain;

import com.example.onlinecoffeesandbox.domain.create.CreateCustomer;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Table(name = "customers")
public class Customer {
    @Id
    private int customerId;
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static Customer newCustomer(CreateCustomer createCustomer) {
        return new Customer(createCustomer.getName(), createCustomer.getAddress(), createCustomer.getPhoneNumber());
    }
}
