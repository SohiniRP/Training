package com.week2.generics;

public interface Container<T> {

    public void addItem(T item);

    public boolean removeItem(T item);
}
