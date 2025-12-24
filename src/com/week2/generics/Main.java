package com.week2.generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(2,8);

        System.out.println(box.toString());

        ContainerImplementation<String> container = new ContainerImplementation<>("Cube");

        container.addItem("Coins");

        System.out.println(container.toString());

    }
}
