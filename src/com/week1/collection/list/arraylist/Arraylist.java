package com.week1.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        //1. Adding Elements
        List<Integer> list = new ArrayList<>(10);
        list.add(37);
        list.add(40);
        list.add(59);

        System.out.println(list);

        //2. Updating Elements
        list.set(1, 42);

        System.out.println(list);

        //3. Searching Elements
        list.add(42);
        System.out.println(list.indexOf(42));
        System.out.println(list.lastIndexOf(42));

        //4. Removing Elements
        list.remove((Integer)37);
        list.remove(1);
        System.out.println(list);

        //5. Accessing Elements
        list.get(0);
        list.get(1);
//        list.get(2); //throws error because index does not exist

        //6. Checking if an element is present or not
        System.out.println(list.contains(42));

        //7. Iterating over List Interface in Java
        list.add(23);
        list.add(67);
        list.add(50);

        //Normal for loop
        for(int i=0;i<list.size()-1;i++){
            list.set(i, list.get(i)+10);
        }

        //enhanced for loop
        for(int i: list){
            System.out.println(i);
        }
    }
}
