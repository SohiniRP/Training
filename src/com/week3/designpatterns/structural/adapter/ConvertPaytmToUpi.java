package com.week3.designpatterns.structural.adapter;

public class ConvertPaytmToUpi implements UpiPayment{

    PaytmPayment paytmPayment;

    public ConvertPaytmToUpi(PaytmPayment paytmPayment){
        this.paytmPayment = paytmPayment;
    }

    @Override
    public void payUsingUpi(int amount) {
        paytmPayment.makePayment(amount);
    }
}
