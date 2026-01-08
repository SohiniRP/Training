package com.week3.designpatterns.creational.singleton;

public class Singleton {

    //Eager Initialization
//    private static Singleton instance = new Singleton();
//
//    private Singleton() {}
//
//    public static Singleton getInstance(){
//        return instance;
//    }

    //Lazy Initialization
//    private static Singleton instance;
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        if(instance==null){
//            instance = new Singleton();
//        }
//
//        return instance;

            // Synchronized method
//        private static Singleton instance;
//
//        private Singleton() {}
//
//        synchronized public static Singleton getInstance() {
//            if(instance==null) {
//                instance = new Singleton();
//            }
//            return instance;
//        }

    //Double Locking
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
