package com.example.customer.customer;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Adress address
) {
}