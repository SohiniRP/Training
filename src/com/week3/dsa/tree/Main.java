package com.week3.dsa.tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.root = new Node(76);
        tree.root.left = new Node(55);
        tree.root.right = new Node(90);
        tree.root.left.left = new Node(45);
        tree.root.left.right = new Node(60);
        tree.root.right.left = new Node(87);
        tree.root.right.right = new Node(99);

        tree.insert(tree.root, 100);
        System.out.println(tree.search(tree.root, 87));

        tree.inOrderTraversal(tree.root);
        System.out.println();
        tree.postOrderTraversal(tree.root);
        System.out.println();
        tree.preOrderTraversal(tree.root);
        System.out.println();
        tree.levelOrderTraversal(tree.root);


    }
}
