package com.week2.concurrency;

import java.io.FilterOutputStream;

public class Inventory implements Runnable{

    private int inventorySize = 200000;

    public int getInventorySize() {
        return inventorySize;
    }

    @Override
    public void run() {
        String function = Thread.currentThread().getName();
        if(function.equals("issue")) {
            for(int i=0;i<100000;i++){
                synchronized (this){
                    inventorySize--;
                }
            }
        } else if(function.equals("receive")){
          for(int i=0;i<100000;i++){
              synchronized (this) {
                  inventorySize++;
              }
            }
        }
    }
}
