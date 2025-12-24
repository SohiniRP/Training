package com.week2.generics;

public class Box<T> {
    private T value;
    private int volume;

    public Box(T value, int volume) {
        this.value = value;
        this.volume = volume;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                ", volume=" + volume +
                '}';
    }
}
