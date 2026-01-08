package com.week3.designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        UpiPayment payment = new ConvertPaytmToUpi(new PaytmPayment());
        payment.payUsingUpi(5000);
    }

}
