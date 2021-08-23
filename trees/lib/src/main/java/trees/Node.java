package main.java.trees;

import main.java.HashTable.HashTree.NodeItem;

public class Node {
    int key;
    private Node left;
    private Node Right;

    public Node(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return Right;
    }

    public void setRight(Node right) {
        Right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }

    public void setLeft(NodeItem node) {
    }

    public void setRight(NodeItem node) {
    }
}
