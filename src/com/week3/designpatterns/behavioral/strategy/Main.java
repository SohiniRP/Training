package com.week3.designpatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new UpiPayment());
        paymentContext.payAmount(5000);

        paymentContext.setPaymentStrategy(new NetbankingPayment());
        paymentContext.payAmount(100000);
    }


}
