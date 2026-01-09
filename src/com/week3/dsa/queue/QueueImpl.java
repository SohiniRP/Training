package com.week3.dsa.queue;

import java.util.ArrayList;

public class QueueImpl<E> {
    //Using arrays
    private ArrayList<E> customQueue;
    private static final int DEFAULT_SIZE = 10;
    int end =0;
    int capacity=0;

    public QueueImpl(int size){
        capacity = size;
        this.customQueue = new ArrayList<>(size);
    }

    public QueueImpl(){
        capacity = DEFAULT_SIZE;
        this.customQueue = new ArrayList<>(DEFAULT_SIZE);
    }

    public boolean isFull(){
        if(end==capacity) return true;
        return false;
    }

    public boolean isEmpty(){
        if(end==0) return true;
        return false;
    }

    public boolean enqueue(E data){
        if(isFull()) return false;
        customQueue.add(data);
        end++;
        return true;
    }

    public E dequeue() throws Exception {
        if(isEmpty()) throw new Exception("Queue is Empty");
        E removed = customQueue.remove(0);
        end--;
        return removed;
    }

    public E peek() throws Exception {
        if(isEmpty()) throw new Exception("Queue is Empty");
        E removed = customQueue.get(end-1);
        return removed;
    }


}
