package main.java.trees;


import main.java.trees.kAryTree.KAryNode;
import main.java.trees.kAryTree.KaryTree;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Binary search");
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(3));
        binaryTree.getRoot().setRight(new Node(4));
        binaryTree.getRoot().getLeft().setLeft(new Node(5));
        binaryTree.getRoot().getLeft().setRight(new Node(7));
        binaryTree.getRoot().getRight().setLeft(new Node(8));
        binaryTree.getRoot().getRight().setRight(new Node(9));
        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.setRoot(new Node(1));
        binaryTree1.getRoot().setLeft(new Node(3));
        binaryTree1.getRoot().setRight(new Node(4));
        binaryTree1.getRoot().getLeft().setLeft(new Node(5));
        binaryTree1.getRoot().getLeft().setRight(new Node(7));
        binaryTree1.getRoot().getRight().setLeft(new Node(8));
        //  binaryTree1.getRoot().getRight().setRight(new Node(9));

//        System.out.println(binaryTree.CheckTrees(binaryTree, binaryTree1));
//        binaryTree.odd(binaryTree);

        //System.out.println(binaryTree.findMax());
        //System.out.println(binaryTree.traverseLevelOrder(binaryTree));
        // System.out.println(binaryTree.findMax());
//          //inOrder
//          binaryTree.inOrder(binaryTree.getRoot());
//          //postOrder
//          binaryTree.postOrder(binaryTree.getRoot());
//          //preOrder
//         binaryTree.preOrder(binaryTree.getRoot());
//        System.out.println("lll");
        //       System.out.println(binaryTree);
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.add(5);
//        bst.add(7);
//        bst.add(3);
//        bst.add(18);
//        System.out.println(bst.Search(9));
//        System.out.println(bst);


        KaryTree<Integer> tree = new KaryTree(3);
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        tree.add(8);
        tree.add(9);
        tree.add(30);
        System.out.println(tree);

        System.out.println(tree.fizzBuzzTree(tree));

    }
}