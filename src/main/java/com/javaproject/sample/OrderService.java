package com.javaproject.sample;

public class OrderService {

    private PaymentMethod paymentMethod;

    /*public OrderService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }*/

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void placeOrder(double amount) {
        paymentMethod.placeOrder(amount);
    }

}
