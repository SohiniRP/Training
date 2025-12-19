package com.week1.oop.polymorphism;

public class Computer {
    private String cpu;
    private String memory;

    public Computer(String cpu, String memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void description(){
        System.out.println("This computer has "+ cpu + " and memory as: " + memory);
    }
}
