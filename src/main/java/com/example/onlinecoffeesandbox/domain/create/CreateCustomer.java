package com.example.onlinecoffeesandbox.domain.create;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateCustomer {
    private String name;
    private String address;
    private String phoneNumber;

    public static CreateCustomer ofDefault() {
        return CreateCustomer.builder()
                .name("danny.kim")
                .address("서울")
                .phoneNumber("010-1234-5678")
                .build();
    }
}
