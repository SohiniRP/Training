package com.week3.solidprinciples.dip;

public class VisitStore {
    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();

        Transaction transaction = new Transaction(bankCard);

        transaction.pay(bankCard, 1000);

    }
}
