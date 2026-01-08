package com.week3.designpatterns.behavioral.strategy;

public class NetbankingPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment method is netbanking: "+ amount);
    }
}
