package com.week3.designpatterns.creational.abstractfactory;

class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(UiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

