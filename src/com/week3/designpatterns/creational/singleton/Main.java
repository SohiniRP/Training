package com.week3.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton newInstance = Singleton.getInstance();
        System.out.println(newInstance);
    }
}
