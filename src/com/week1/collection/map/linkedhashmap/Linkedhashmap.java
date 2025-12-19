package com.week1.collection.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();

        //1. Adding Elements in LinkedHashMap
        linkedMap.put("Apple", 50);
        linkedMap.put("Banana", 30);
        linkedMap.put("Mango", 70);
        linkedMap.put("Orange", 40);

        //2. Updating Elements in LinkedHashMap
        linkedMap.put("Banana", 60);

        //3. Removing Element in LinkedHashMap
        linkedMap.remove("Banana");

        //4. Iterating through the LinkedHashMap
        for (Map.Entry<String, Integer> mapElement : linkedMap.entrySet()) {

            String k = mapElement.getKey();

            // Finding the value
            // using getValue() method
            Integer v = mapElement.getValue();

            // Printing the key-value pairs
            System.out.println(k + " : " + v);
        }
    }
}
