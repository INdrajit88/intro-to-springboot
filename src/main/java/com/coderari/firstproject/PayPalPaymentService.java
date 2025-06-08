package com.coderari.firstproject;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using PayPal.");
    }
}
