package com.week3.designpatterns.structural.adapter;

public class PaytmPayment {

    public void makePayment(int amount){
        System.out.println("Paid " + amount + " rupees using Paytm");
    }
}
