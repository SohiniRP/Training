package com.week1.oop.polymorphism;

public class Polymorph {
    public static void main(String[] args) {
        Laptop c = new Laptop("Multiprocessing", "16gb", 8);
        Computer c1 = new Computer("Multiprocessing", "16gb");
        c.setNumOfCores("OctaCore");
        c.description();
        c1.description();
    }
}
