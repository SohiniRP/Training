package com.week3.linkedlist;

public class SinglyLinkedList {

    Node head;
    //traverse LinkedList
    public static void printList(Node node){
        while(node!=null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    //Insert at the beginning
    public Node insertAtStart(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    //Insert at the End
    public Node insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    //Insert at any position
    public Node insert(int data, int position){
        Node newNode = new Node(data);
        Node temp =head;

        for(int i=0;i<=position-1;i++){
             temp = temp.next;

        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    //
}
