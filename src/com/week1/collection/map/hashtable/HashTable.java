package com.week1.collection.map.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>(4);

        //1. Adding Elements
        table.put("One", 1);
        table.put("Two", 2);
        table.put("Three", 3);

        System.out.println("Hashtable Elements: " + table);

        //2. Changing Elements
        table.put("Two", 5);

        //3. Removing Element
        table.put("Four", 4);
        table.remove("Four");

        //4. Traversal of a Hashtable
        for (Map.Entry<String, Integer> e : table.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }


}
