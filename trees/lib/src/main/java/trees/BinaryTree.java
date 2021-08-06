package main.java.trees;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTree {
    Node Root;

    public ArrayList<Integer> preOrderArr = new ArrayList<>();
    public ArrayList<Integer> inOrderArr = new ArrayList<>();
    public ArrayList<Integer> postOrderArr = new ArrayList<>();
    public LinkedList<Node> linkedList = new LinkedList<>();
    public  ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> even = new ArrayList<>();

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
    int max;
    public int findMax(){

        if (Root == null) {
            System.out.println("Empty Tree");
        }
        Node temp = Root;
        max = temp.getKey();

        if (temp.getLeft() != null) {
            traverse(temp.getLeft());
        }
        if (temp.getRight() != null) {
            traverse(temp.getRight());
        }
        return max;
    }

    private void traverse(Node node) {
        if (node.getKey() > max) {
            max = node.getKey();
        }
        if (node.getLeft() != null) {
            traverse(node.getLeft());
        }
        if (node.getRight() != null) {
            traverse(node.getRight());
        }
    }

    LinkedList<Node> linkedList1 = new LinkedList<>();
    ArrayList<Integer> list1 = new ArrayList<>();

    public ArrayList<Integer> odd(BinaryTree tree) {
        if (Root != null) {
            linkedList1.add(tree.Root);
            while (!linkedList1.isEmpty()) {
                Node node = linkedList1.remove();

                    list1.add(node.key);

                if (node.getLeft() != null) {
                        linkedList1.add(node.getLeft());
                 }

                if (node.getRight() != null) {

                    linkedList1.add(node.getRight()); }
            }
            for (int i = 0; i < list1.size() ; i++) {
                if(list1.get(i) % 2 != 0){
                    even.add(list1.get(i));
                }
            }
        }
        System.out.println(even);
        return list1;
    }

    public int getFilesNum() {
        return getFilesNum(getRoot());
    }

    public static boolean CheckTrees(BinaryTree tree1, BinaryTree tree2) {
        int num1 = tree1.getFilesNum();
        int num2 = tree2.getFilesNum();
        return num1 == num2;
    }

    public int getFilesNum(Node node) {
        if (node == null)
            return 0;
        if (node.getLeft() == null && node.getRight() == null)
            return 1;
        else
            return getFilesNum(node.getLeft()) + getFilesNum(node.getRight());
    }

    public ArrayList<Integer> breadthFirst(BinaryTree tree) {
        if (Root != null) {
            linkedList.add(tree.Root);
            while (!linkedList.isEmpty()) {
                Node node = linkedList.remove();
                list.add(node.key);

                if (node.getLeft() != null) {
                    linkedList.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    linkedList.add(node.getRight());
                }
            }
        }
        return list;
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