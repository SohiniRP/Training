package com.week3.designpatterns.creational.abstractfactory;

public class WindowsFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
