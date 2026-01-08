package com.week3.linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.printList(list.head);

        list.insertAtStart(5);
        list.printList(list.head);

        list.insert(15, 3);
        list.printList(list.head);

        list.deleteFirst();
        list.printList(list.head);

        list.deleteEnd();
        list.printList(list.head);

        list.deleteByValue(20);
        list.printList(list.head);

        System.out.println("Length: " + list.length());

        list.insert(1,1);

        System.out.println(list.search(1));
        System.out.println(list.searchPosition(0));
    }
}
