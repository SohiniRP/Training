package com.week1.assignment.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        //1. Creating an Unmodifiable List: An unmodifiable list can
        // be created using the Collections.unmodifiableList() method.
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println(unmodifiableList);

        //2. Creating an Immutable List (Java 9 and above)
        //Java 9 introduced factory methods to create truly immutable collections.

        List<String> immutableList = List.of("A", "B", "C");
        System.out.println(immutableList);
    }
}
