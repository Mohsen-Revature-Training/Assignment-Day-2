package com.revature.training.payment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        org.springframework.context.annotation.AnnotationConfigApplicationContext context =
            new org.springframework.context.annotation.AnnotationConfigApplicationContext("com.revature.training.payment");

        PaymentProcessor paymentProcessor = context.getBean("paymentProcessor", PaymentProcessor.class);

        // Use Credit Card
        Payment creditCardPayment = context.getBean("creditCardPayment", Payment.class);
        paymentProcessor.process(creditCardPayment);

        // Use PayPal
        Payment paypalPayment = context.getBean("payPalPayment", Payment.class);
        paymentProcessor.process(paypalPayment);
    }
}
