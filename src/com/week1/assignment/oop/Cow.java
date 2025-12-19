package com.week1.assignment.oop;

public class Cow extends Herbivore {
    public Cow(String description){
        super(description);
    }

    public void eats(){
        System.out.println("Cow eats grass");
    }
}
