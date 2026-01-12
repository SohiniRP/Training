package com.week3.dsa.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackImpl<E> {
    //Using arrays
    private ArrayList<E> customStack;
    private static final int DEFAULT_SIZE = 10;
    int top =-1;

    public StackImpl() {
        this.customStack = new ArrayList<>();
    }

    public boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }

    public boolean push(E element){
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
