package com.week3.designpatterns.creational.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows CheckBox");
    }
}
