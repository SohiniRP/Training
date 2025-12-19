package com.week1.collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        //1. Adding Elements in HashMap
        map.put(1, "Hash");
        map.put(2, "Map");
        map.put(3, "Practice");
        //2. Changing Elements in HashMap
        map.put(1, "Hash Map");
        map.put(2, "First");
        //3. Removing Element from HashMap
        map.remove(2);
        //4. Traversal of HashMap
        for (Map.Entry<Integer, String> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
    }
}
