package com.week3.dsa.stack;

public class Main {
    public static void main(String[] args) throws StackException{
        StackImpl<Integer> stack = new StackImpl<>(8);


        stack.push(7);
        stack.push(7);
        stack.push(89);
        stack.push(12);
        stack.push(56);



        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
//        stack.pop();

    }
}
