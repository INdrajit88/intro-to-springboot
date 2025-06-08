package com.coderari.firstproject;

public class OrderService {
    public void placeOrder() {
        var paymentService = new StripePaymentService();
        paymentService.processPayment(amount:10);
    }
}
