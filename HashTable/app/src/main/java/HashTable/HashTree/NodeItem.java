package main.java.HashTable.HashTree;

public class NodeItem {
    int key;
    private NodeItem left;
    private NodeItem Right;

    public NodeItem(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public NodeItem getLeft() {
        return left;
    }

    public void setLeft(NodeItem left) {
        this.left = left;
    }

    public NodeItem getRight() {
        return Right;
    }

    public void setRight(NodeItem right) {
        Right = right;
    }
}
