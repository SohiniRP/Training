package com.week2.concurrency;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Thread t1 = new Thread(inventory, "issue");
        Thread t2 = new Thread(inventory, "receive");

        t1.start();
        t2.start();

        try{
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println(inventory.getInventorySize());
    }
}
