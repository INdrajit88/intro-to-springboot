package com.coderari.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FirstprojectApplication.class, args);
        var orderService= context.getBean(OrderService.class);
//        var orderService = new OrderService(new PayPalPaymentService());
//        var orderService = new OrderService();
//        orderService.setPaymentService(new PayPalPaymentService());
        orderService.placeOrder();
    }

}
