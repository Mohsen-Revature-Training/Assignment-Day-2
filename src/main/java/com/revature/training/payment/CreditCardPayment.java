package com.revature.training.payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid $20 using a credit card");
    }
}