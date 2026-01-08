package com.week3.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {

        Weather station = new Weather();

        Observer mobile = new MobileDisplay();
        Observer web = new WebDisplay();

        station.registerObserver(mobile);
        station.registerObserver(web);

        station.setTemperature(38.5f);
        station.setTemperature(32.0f);
    }
}
