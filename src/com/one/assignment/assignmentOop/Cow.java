package com.one.assignment.assignmentOop;

public class Cow extends Herbivore {
    public Cow(String description){
        super(description);
    }

    public void eats(){
        System.out.println("Cow eats grass");
    }
}
