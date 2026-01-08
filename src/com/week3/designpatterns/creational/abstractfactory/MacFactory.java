package com.week3.designpatterns.creational.abstractfactory;

public class MacFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
