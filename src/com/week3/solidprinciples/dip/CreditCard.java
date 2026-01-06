package com.week3.solidprinciples.dip;

public class CreditCard implements BankCard{
    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction done with Credit Card: "+ amount);
    }
}
