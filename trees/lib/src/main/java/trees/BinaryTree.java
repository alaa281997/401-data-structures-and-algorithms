package main.java.trees;

import java.util.ArrayList;

public class BinaryTree {
    Node Root;

    public ArrayList<Integer> preOrderArr = new ArrayList<>();
    public ArrayList<Integer> inOrderArr = new ArrayList<>();
    public ArrayList<Integer> postOrderArr = new ArrayList<>();

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.getLeft());
            System.out.println(" " + node.key);
            inOrderArr.add(node.key);
            inOrder(node.getRight());

        }
    }
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(" " +node.key );
            postOrderArr.add(node.key);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {

            System.out.print(" " + node.key);
            preOrderArr.add(node.key);
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }
    public Node getRoot() {
        return Root;
    }

    public void setRoot(Node root) {
        Root = root;
    }

    public ArrayList<Integer> getPreOrderArr() {
        return preOrderArr;
    }

    public ArrayList<Integer> getInOrderArr() {
        return inOrderArr;
    }

    public ArrayList<Integer> getPostOrderArr() {
        return postOrderArr;
    }
    @Override
    public String toString() {
        return "BinaryTree{" +
                "Root=" + Root +
                "Left" + Root.getLeft()+
                "Right" + Root.getRight()+
                '}';
    }
}
