package com.week3.designpatterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        UiFactory factory = new MacFactory();
        Application application = new Application(factory);
        application.paint();
    }

}
