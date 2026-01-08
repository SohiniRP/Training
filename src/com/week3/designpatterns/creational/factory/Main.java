package com.week3.designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        System.out.println(factory.createVehicle(6));

        System.out.println(factory.createVehicle(10));
    }
}
