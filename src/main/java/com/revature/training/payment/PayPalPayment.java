package com.revature.training.payment;

public class PayPalPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid $10 using PayPal");
    }
}
