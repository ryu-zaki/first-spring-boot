package com.javaproject.sample;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentMethod implements PaymentMethod {

    public void placeOrder(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }

}
