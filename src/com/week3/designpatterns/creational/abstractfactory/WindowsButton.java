package com.week3.designpatterns.creational.abstractfactory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
