package com.week3.designpatterns.creational.factory;

public class VehicleFactory {

    public Vehicle createVehicle(int numberOfSeats){
        if(numberOfSeats>8) return new Bus();
        return new Car();
    }

    @Override
    public String toString() {
        return "VehicleFactory{}";
    }
}
