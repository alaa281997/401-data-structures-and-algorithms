package main.java.HashTable.HashTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {

        BinaryTree binaryTree1 = new BinaryTree();
        BinaryTree binaryTree2 = new BinaryTree();

        binaryTree1.setRoot(new NodeItem(150));
        binaryTree1.getRoot().setLeft(new NodeItem(100));
        binaryTree1.getRoot().setRight(new NodeItem(250));
        binaryTree1.getRoot().getRight().setLeft(new NodeItem(75));
        binaryTree1.getRoot().getRight().setRight(new NodeItem(160));
        binaryTree1.getRoot().getLeft().setLeft(new NodeItem(200));
        binaryTree1.getRoot().getLeft().setRight(new NodeItem(350));
        binaryTree1.getRoot().getLeft().getRight().setRight(new NodeItem(500));
        binaryTree1.getRoot().getLeft().getRight().setLeft(new NodeItem(300));
        binaryTree1.getRoot().getRight().getRight().setRight(new NodeItem(175));
        binaryTree1.getRoot().getRight().getRight().setLeft(new NodeItem(125));

        binaryTree2.setRoot(new NodeItem(42));
        binaryTree2.getRoot().setLeft(new NodeItem(100));
        binaryTree2.getRoot().setRight(new NodeItem(600));
        binaryTree2.getRoot().getRight().setLeft(new NodeItem(15));
        binaryTree2.getRoot().getRight().setRight(new NodeItem(160));
        binaryTree2.getRoot().getLeft().setLeft(new NodeItem(200));
        binaryTree2.getRoot().getLeft().setRight(new NodeItem(350));
        binaryTree2.getRoot().getLeft().getRight().setRight(new NodeItem(500));
        binaryTree2.getRoot().getLeft().getRight().setLeft(new NodeItem(4));
        binaryTree2.getRoot().getRight().getRight().setRight(new NodeItem(175));
        binaryTree2.getRoot().getRight().getRight().setLeft(new NodeItem(125));


      System.out.println(binaryTree1.treeIntersection(binaryTree1, binaryTree2));



    }

}

package main.java.HashTable.HashTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {

        BinaryTree binaryTree1 = new BinaryTree();
        BinaryTree binaryTree2 = new BinaryTree();

        binaryTree1.setRoot(new NodeItem(150));
        binaryTree1.getRoot().setLeft(new NodeItem(100));
        binaryTree1.getRoot().setRight(new NodeItem(250));
        binaryTree1.getRoot().getRight().setLeft(new NodeItem(75));
        binaryTree1.getRoot().getRight().setRight(new NodeItem(160));
        binaryTree1.getRoot().getLeft().setLeft(new NodeItem(200));
        binaryTree1.getRoot().getLeft().setRight(new NodeItem(350));
        binaryTree1.getRoot().getLeft().getRight().setRight(new NodeItem(500));
        binaryTree1.getRoot().getLeft().getRight().setLeft(new NodeItem(300));
        binaryTree1.getRoot().getRight().getRight().setRight(new NodeItem(175));
        binaryTree1.getRoot().getRight().getRight().setLeft(new NodeItem(125));

        binaryTree2.setRoot(new NodeItem(42));
        binaryTree2.getRoot().setLeft(new NodeItem(100));
        binaryTree2.getRoot().setRight(new NodeItem(600));
        binaryTree2.getRoot().getRight().setLeft(new NodeItem(15));
        binaryTree2.getRoot().getRight().setRight(new NodeItem(160));
        binaryTree2.getRoot().getLeft().setLeft(new NodeItem(200));
        binaryTree2.getRoot().getLeft().setRight(new NodeItem(350));
        binaryTree2.getRoot().getLeft().getRight().setRight(new NodeItem(500));
        binaryTree2.getRoot().getLeft().getRight().setLeft(new NodeItem(4));
        binaryTree2.getRoot().getRight().getRight().setRight(new NodeItem(175));
        binaryTree2.getRoot().getRight().getRight().setLeft(new NodeItem(125));


      System.out.println(binaryTree1.treeIntersection(binaryTree1, binaryTree2));

    }

}

