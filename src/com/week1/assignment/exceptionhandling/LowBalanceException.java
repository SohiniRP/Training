package com.week1.assignment.exceptionhandling;

public class LowBalanceException extends RuntimeException{

    public LowBalanceException(String message){
        super(message);
  ;  }
}
