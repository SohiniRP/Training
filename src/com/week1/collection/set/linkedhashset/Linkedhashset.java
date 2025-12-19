package com.week1.collection.set.linkedhashset;

import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();

        //1. Adding Elements in LinkedHashSet
        linkedSet.add("Adding");
        linkedSet.add("Elements");
        linkedSet.add("Hashset");

        //2. Removing Elements in HashSet
        linkedSet.remove("Hashset");
        linkedSet.add("in Hashset");

        //3. Iterating through the HashSet
        for (String element : linkedSet)
            System.out.print(element + " ");
    }
}
