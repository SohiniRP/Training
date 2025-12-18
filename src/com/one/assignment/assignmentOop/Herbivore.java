package com.one.assignment.assignmentOop;

public abstract class Herbivore extends Animal {
    public Herbivore(String description) {
        super(description);
    }

    public void hunts(){
        System.out.println("Herbivores don't hunt.");
    }
}
