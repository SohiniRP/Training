package com.week1.collection.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>();

        //1. Adding Elements
        tree.put(3, "Language");
        tree.put(2, "Programming");
        tree.put(1, "Java");

        //2. Changing Elements
        tree.put(3, "Language is best");

        //3. Removing Element
        tree.put(4, "Language");
        tree.remove(4);

        //4. Iterating Elements
        for (Map.Entry<Integer, String> e : tree.entrySet()) {
            int k = e.getKey();
            String v = e.getValue();

            System.out.println(k + " : " + v);
        }
    }
}
