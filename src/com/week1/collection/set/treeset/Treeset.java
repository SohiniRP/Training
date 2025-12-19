package com.week1.collection.set.treeset;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        //1. Adding Elements in LinkedHashSet
        treeSet.add("Adding");
        treeSet.add("Elements");
        treeSet.add("Hashset");

        //2. Removing Elements in HashSet
        treeSet.remove("Hashset");
        treeSet.add("in Hashset");

        //3. Iterating through the HashSet
        for (String element : treeSet)
            System.out.print(element + " ");
    }
}
