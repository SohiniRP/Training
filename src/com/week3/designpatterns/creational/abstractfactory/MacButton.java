package com.week3.designpatterns.creational.abstractfactory;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
