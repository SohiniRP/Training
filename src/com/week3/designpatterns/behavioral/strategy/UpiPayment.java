package com.week3.designpatterns.behavioral.strategy;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment method is Upi: "+ amount);
    }
}
