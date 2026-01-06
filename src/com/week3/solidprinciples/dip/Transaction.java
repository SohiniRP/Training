package com.week3.solidprinciples.dip;

public class Transaction {

    private BankCard bankCard;

    public Transaction(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void pay(BankCard bankCard, int amount){
        bankCard.doTransaction(amount);
    }
}
