package com.week1.assignment.exceptionhandling;

public class CheckBalance {
    public static void main(String[] args) {
        try{
            checkBalance(1000,700);
        } catch(LowBalanceException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkBalance(int amount, int balance){
        if(amount>balance){
            throw new LowBalanceException("Balance is low!!");
        }
    }
}
