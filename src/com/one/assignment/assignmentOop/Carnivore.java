package com.one.assignment.assignmentOop;

public abstract class Carnivore extends Animal {
    public Carnivore(String description) {
        super(description);
    }

    public void hunts(){
        System.out.println("Carnivore animals hunt other animals");
    }
}
