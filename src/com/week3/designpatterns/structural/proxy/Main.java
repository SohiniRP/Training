package com.week3.designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {

        Image image = new ImageProxy("photo.jpg");

        image.display(); // loads & displays

    }
}

