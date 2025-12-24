package com.week2.generics;

public class ContainerImplementation<T> implements Container<T>{
    private T item;

    public ContainerImplementation(T item) {
        this.item = item;
    }

    @Override
    public void addItem(T item) {
        this.item = item;
    }

    @Override
    public boolean removeItem(T item) {
        this.item = null;
        return true;
    }

    @Override
    public String toString() {
        return "{" +
                "item=" + item +
                '}';
    }
}
