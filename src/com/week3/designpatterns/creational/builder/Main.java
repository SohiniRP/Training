package com.week3.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Sohini", 100)
                .build();

        System.out.println(user);
    }
}
