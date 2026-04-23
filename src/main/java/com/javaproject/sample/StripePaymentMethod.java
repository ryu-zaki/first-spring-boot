package com.javaproject.sample;

public class StripePaymentMethod implements PaymentMethod {

    public void placeOrder(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }

}
