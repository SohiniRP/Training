package com.week1.assignment.oop;

public class Lion extends Carnivore {
    public Lion(String description){
        super(description);
    }

    public void eats(){
        System.out.println("Lion eats meat");
    }
}
