package com.revature.training.payment;

public class PaymentProcessor {
    public void process(Payment payment) {
        if (payment != null) {
            payment.pay();
        } else {
            System.out.println("No payment method set.");
        }
    }
}