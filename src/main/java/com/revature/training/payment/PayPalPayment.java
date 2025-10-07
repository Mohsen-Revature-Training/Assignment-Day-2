package com.revature.training.payment;

import org.springframework.stereotype.Component;

@Component("payPalPayment")
public class PayPalPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid $10 using PayPal");
    }
}
