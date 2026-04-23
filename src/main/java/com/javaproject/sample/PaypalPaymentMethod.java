package com.javaproject.sample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PaypalPaymentMethod implements PaymentMethod {

    public void placeOrder(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }

}
