package com.week1.assignment.collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ModificationDuringIteration {
//    No, we cannot modify (add/remove) an ArrayList while iterating using a for loop.
//    Doing so causes a ConcurrentModificationException.

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

//        for (String s : list) {
////            list.remove(s); // Throws ConcurrentModificationException
//            System.out.println(s);
//        }
//
//        //CopyOnWriteArrayList allows modification while iterating and does NOT throw ConcurrentModificationException
//        CopyOnWriteArrayList<String> modifiableList = new CopyOnWriteArrayList<>();
//
//        modifiableList.add("Apple");
//        modifiableList.add("Banana");
//        modifiableList.add("Mango");
//
//        for (String s : modifiableList) {
//            modifiableList.remove(s); // Throws ConcurrentModificationException
//            System.out.println(s);
//        }

        //Using Iterator

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            if(iterator.next().equals("Banana")) iterator.remove();
            System.out.println(list);
        }
    }
}
