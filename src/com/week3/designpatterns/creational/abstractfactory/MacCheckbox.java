package com.week3.designpatterns.creational.abstractfactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mac CheckBox");
    }
}
