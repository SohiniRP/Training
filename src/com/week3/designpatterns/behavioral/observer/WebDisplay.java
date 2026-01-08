package com.week3.designpatterns.behavioral.observer;

class WebDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Web Display: " + temperature);
    }
}
