package com.week1.assignment.exceptionhandling;

public class ExceptionTypes {

    public static void main(String[] args) {
        try {
            try {
                //unchecked exception
                int x = 100 / 0; // Arithmetic Exception
            } catch(ArithmeticException e){
                System.out.println("You cannot divide by 0");
            }
            //checked exception
            Class.forName("com.week1.assignment.exceptionhandling.Engine"); //ClassNotFoundException
        } catch(ClassNotFoundException e){
            System.out.println("The class does not exist");
        }
    }
}
