package com.week1.oop.polymorphism;

public class Laptop extends Computer{
    Object numOfCores;

    public Laptop(String cpu, String memory, int numOfCores) {
        super(cpu, memory);
        this.numOfCores = numOfCores;
    }

    public int getNumOfCores() {
        return (int) numOfCores;
    }

    public void setNumOfCores(int numOfCores) {
        this.numOfCores = numOfCores;
    }

    public void setNumOfCores(String type){
        this.numOfCores = type;
    }

    @Override
    public void description(){
        System.out.println("This computer has "+ super.getCpu() + " and memory as: " + super.getMemory() + " and number of cores as: "+ numOfCores);
    }
}
