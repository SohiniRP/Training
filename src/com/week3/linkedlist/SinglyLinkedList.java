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
        if(head==null) return null;
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

        if (position == 1) {
            insertAtStart(data);
            return head;
        }

        for(int i=0;i<=position-1 && temp!=null;i++){
             temp = temp.next;

        }

        if (temp == null) {
            System.out.println("Position out of range");
            return null;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    //delete from the beginning
    public void deleteFirst(){
        if(head==null) {
            System.out.println("Empty List");
            return;
        }
        head = head.next;
    }

    //delete from the end
    public void deleteEnd(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    //delete by value
    public void deleteByValue(int key){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }

        temp.next = temp.next.next;
    }

    // length of linkedList
    public int length() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    //Searching in LinkedList
    public boolean search(int key){
        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //Search and return position
    public int searchPosition(int key){
        int position =1;
        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return position;
            }
            position++;
            temp = temp.next;
        }
        return -1;
    }


}
