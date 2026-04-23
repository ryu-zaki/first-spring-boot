package com.javaproject.sample;

public class PaypalPaymentMethod implements PaymentMethod {

    public void placeOrder(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }

}
