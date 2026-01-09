package com.week3.dsa.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackImpl<E> {
    //Using arrays
    private ArrayList<E> customStack;
    private static final int DEFAULT_SIZE = 10;
    int top =-1;
    int capacity=0;

    public StackImpl() {
        capacity = DEFAULT_SIZE;
        this.customStack = new ArrayList<>(DEFAULT_SIZE);
    }

    public StackImpl(int size) {
        capacity = size;
        this.customStack = new ArrayList<>(size);
    }

    public boolean isFull(){
        if(top==capacity-1) return true;
        return false;
    }

    public boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }

    public boolean push(E element){
        if(isFull()){
            throw new StackException("Stack is full");
        }
        top++;
        customStack.add(element);
        return true;
    }

    public E pop(){
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        E element = customStack.remove(top);
        top--;
        return element;
    }

    public E peek(){
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return customStack.get(top);
    }

}
