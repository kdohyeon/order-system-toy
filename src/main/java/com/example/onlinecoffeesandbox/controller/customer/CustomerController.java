package com.example.onlinecoffeesandbox.controller.customer;

import com.example.onlinecoffeesandbox.controller.response.Response;
import com.example.onlinecoffeesandbox.domain.create.CreateCustomer;
import com.example.onlinecoffeesandbox.service.customer.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/api/v1/customer")
    public Response<Integer> createNewCustomer(
            @RequestParam String name,
            @RequestParam String address,
            @RequestParam String phoneNumber
    ) {
        return Response.ok(customerService.newCustomer(CreateCustomer
                .builder()
                .address(address)
                .name(name)
                .phoneNumber(phoneNumber)
                .build()
        ).getCustomerId());
    }
}
