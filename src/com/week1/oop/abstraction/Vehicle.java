package com.week1.oop.abstraction;

public abstract class Vehicle {

    public abstract void brake();
    public abstract void accelerate();

    public void startEngine(){
        System.out.println("Engine has started!!");
    }
}
