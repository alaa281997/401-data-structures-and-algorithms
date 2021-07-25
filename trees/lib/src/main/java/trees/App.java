package main.java.trees;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Binary search");
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(180));
        binaryTree.getRoot().setRight(new Node(120));
        binaryTree.getRoot().getLeft().setLeft(new Node(4));
        binaryTree.getRoot().getLeft().setRight(new Node(100));

        System.out.println(binaryTree.findMax());
//          //inOrder
//          binaryTree.inOrder(binaryTree.getRoot());
//          //postOrder
//          binaryTree.postOrder(binaryTree.getRoot());
//          //preOrder
//         binaryTree.preOrder(binaryTree.getRoot());
//        System.out.println("lll");
//        System.out.println(binaryTree.preOrderArr);
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.add(5);
//        bst.add(7);
//        bst.add(3);
//        bst.add(18);
//        System.out.println(bst.Search(9));
      //  System.out.println(bst);

    }
}
