package com.week1.assignment.oop;

public abstract class Animal {
    private String description;

    public Animal(String description){
        this.description = description;
    }

    public void sleep(){
        System.out.println("Sleeps at night");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void drinks(){
        System.out.println("Drinks water");
    }

    public abstract void hunts();
    public abstract void eats();
}
