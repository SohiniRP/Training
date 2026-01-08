package com.week3.designpatterns.creational.factory;

public class Bus implements Vehicle{
    @Override
    public void drive(Vehicle vehicle) {
        System.out.println("Vehicle is a Bus");
    }

    @Override
    public String toString() {
        return "Bus";
    }
}
