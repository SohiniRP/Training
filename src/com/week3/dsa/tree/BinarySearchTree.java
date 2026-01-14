package com.week3.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public BinarySearchTree() {}

    Node root = null;

    public void inOrderTraversal(Node node){
        if(node!=null) {
            inOrderTraversal(node.left);
            System.out.println(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(Node node){
        if(node!=null){
            System.out.println(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node){
        if(node!=null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.data+" ");
        }
    }

    public Node insert(Node node, int data){
        if(node ==null){
            node = new Node(data);
        } else{
            if(node.data>data){
                node.left = insert(node.left, data);
            } else{
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public boolean search(Node root, int data){
        boolean found = false;
        while(root!=null && found==false){
            int value = root.data;
            if(value>data){
                root = root.left;
            } else if(value<data){
                root = root.right;
            } else{
                found = true;
                break;
            }
            search(root, data);
        }
        return found;
    }

    public void levelOrderTraversal(Node node){
        Queue<Node> q = new LinkedList<>();
        if(node!=null){
            q.add(node);
        }
        while(!q.isEmpty()){
            Node current = q.poll();
            System.out.println(current.data + " ");

            if(current.left!=null){
//                levelOrderTraversal(current.left);
                q.add(current.left);
            }

            if(current.right!=null){
//                levelOrderTraversal(current.right);
                q.add(current.right);
            }
        }
    }
}
