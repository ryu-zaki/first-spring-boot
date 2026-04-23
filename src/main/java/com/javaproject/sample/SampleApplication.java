package com.javaproject.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SampleApplication.class, args);
		context.getBean(OrderService.class).placeOrder(900);
	}

}
