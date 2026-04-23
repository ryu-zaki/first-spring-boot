package com.javaproject.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SampleApplication.class, args);
	    OrderService orderService = new OrderService();
		orderService.setPaymentMethod(new StripePaymentMethod());
		orderService.placeOrder(200);
	}

}
