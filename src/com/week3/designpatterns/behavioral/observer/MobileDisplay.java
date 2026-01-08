package com.week3.designpatterns.behavioral.observer;

class MobileDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Mobile Display: " + temperature);
    }
}

