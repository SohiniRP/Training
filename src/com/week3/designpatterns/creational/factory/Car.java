package com.week3.designpatterns.creational.factory;

public class Car implements Vehicle{

    @Override
    public void drive(Vehicle vehicle) {
        System.out.println("Vehicle is a Car");
    }

    @Override
    public String toString() {
        return "Car";
    }
}
