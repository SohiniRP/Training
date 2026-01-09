package com.week3.dsa.queue;

public class Main {
    public static void main(String[] args) throws Exception {
        QueueImpl<String> queue = new QueueImpl<>();

        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("ghi");
        queue.enqueue("jkl");
        queue.enqueue("mno");

        System.out.println(queue.peek());

        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
