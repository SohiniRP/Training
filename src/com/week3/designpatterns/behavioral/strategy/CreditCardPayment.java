package com.week3.designpatterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment method is credit card: "+ amount);
    }
}
