package com.revature.training.payment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        org.springframework.context.ApplicationContext context =
            new org.springframework.context.support.ClassPathXmlApplicationContext("applicationcontext.xml");

        PaymentProcessor paymentProcessor = context.getBean("paymentProcessor", PaymentProcessor.class);

        // Use Credit Card
        Payment creditCardPayment = (Payment) context.getBean("creditCardPayment");
        paymentProcessor.process(creditCardPayment);

        // Use PayPal
        Payment paypalPayment = (Payment) context.getBean("payPalPayment");
        paymentProcessor.process(paypalPayment);
    }
}
