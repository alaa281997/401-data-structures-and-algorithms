package main.java.HashTable.HashTree;

import main.java.trees.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class BinaryTree {
    public NodeItem Root;

    public ArrayList<Integer> preOrderArr = new ArrayList<>();
    public ArrayList<Integer> inOrderArr = new ArrayList<>();
    public ArrayList<Integer> postOrderArr = new ArrayList<>();

    private final HashMap<Integer, Integer> hashMap = new HashMap<>();
    private final ArrayList<Integer> list = new ArrayList<>();

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.getLeft());
            System.out.println(" " + node.getKey());
            inOrderArr.add(node.getKey());
            inOrder(node.getRight());

        }
    }
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(" " +node.getKey() );
            postOrderArr.add(node.getKey());
        }
    }
    public void preOrder(Node node) {
        if (node != null) {

            System.out.print(" " + node.getKey());
            preOrderArr.add(node.getKey());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public NodeItem getRoot() {
        return Root;
    }

    public void setRoot(NodeItem root) {
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

    public List<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2){
        if (tree1.Root == null || tree2.Root == null) {
            return null;
        }
        traverse(tree1.Root);

        compare(tree2.Root);

        return list;
    }
    public void traverse(NodeItem node) {
        if (node != null) {
            int count = 0 ;
            if(hashMap.get(node.getKey()) == null){
                count = 1;
            }else{
                count = count +1;
            }

            hashMap.put(node.getKey(),count);

            traverse(node.getLeft());
            traverse(node.getRight());
        }
    }
    public void compare(NodeItem node){
        if (node != null) {
            if (hashMap.get(node.key) != null){
                list.add(node.key);
            }
            compare(node.getLeft());
            compare(node.getRight());
        }
    }



}
