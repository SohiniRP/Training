package com.week2.javafeatures;

import java.util.*;

public class Java8Practice{

    public static void main(String[] args) {
        Add add = (a,b) -> a+b;

        System.out.println(add.addition(34,78));

        List<String> names = Arrays.asList("Sohini", "akj", "vISHNU");

        names.stream().filter(a->a.startsWith("a"))
                .map(String::toUpperCase).forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Muskmelon");
        list.add("Grapes");
        list.add("Apple");
        list.add("Guava");

        Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        TreeSet<Integer> setTree = new TreeSet<>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        setTree.add(24);
        setTree.add(34);
        setTree.add(10);
        setTree.add(9);
        setTree.add(45);
        System.out.println(setTree);
    }


}
