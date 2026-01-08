package com.week3.designpatterns.structural.decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public double cost() {
        return 25;
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }
}
