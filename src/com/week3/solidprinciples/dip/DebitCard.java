package com.week3.solidprinciples.dip;

public class DebitCard implements BankCard{
    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction done with Debit Card: "+ amount);
    }
}
