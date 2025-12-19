package com.week1.collection.set.hashset;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<String>();

        //1. Adding Elements in HashSet
        hashset.add("Adding");
        hashset.add("Elements");
        hashset.add("Hashset");

        //2. Removing Elements in HashSet
        hashset.remove("Hashset");
        hashset.add("in Hashset");

        //3. Iterating through the HashSet
        for (String element : hashset)
            System.out.print(element + " , ");
    }
}
