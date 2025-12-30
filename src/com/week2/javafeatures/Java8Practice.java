package com.week2.javafeatures;

import java.net.CookieHandler;
import java.util.*;
import java.util.stream.Collectors;

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


        List<Product> product = List.of(new Product("Bingo", "Chips", 5),
                new Product("ParleG", "Biscuits", 6),
                new Product("Dove", "Shampoo", 2),
                new Product("LifeBouy", "Soap", 4),
                new Product("Bhujiya", "Namkeen", 1),
                new Product("Amul Dark", "Chocolate", 3),
                new Product("Dairy Milk", "Chocolate", 10),
                new Product("Clinic Plus", "Shampoo", 7),
                new Product("Loreal", "Shampoo", 5),
                new Product("Dettol", "Soap", 6));

        Map<String, List<Product>> map = product.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        System.out.println(map);

        //counting
        Map<String, Long> count = product.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));

        System.out.println(count);

        //Summing
        Map<String, Integer> totalQty = product.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.summingInt(Product::getQuantity)));

        System.out.println(totalQty);

        //Average
        Map<String, Double> averageQty = product.stream()
                .collect(Collectors.groupingBy(Product::getName, Collectors.averagingDouble(Product::getQuantity)));

        System.out.println(averageQty);

        //Changing Collection
        Map<String, Set<String>> categoryList = product.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.mapping(Product::getName, Collectors.toSet())));

        System.out.println(categoryList);
    }
}
