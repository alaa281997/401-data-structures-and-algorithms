package main.java.trees.kAryTree;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class KaryTree<T> {
    KAryNode root;
    int nodes;
    int K;


    public KaryTree(int k) {
        if(k<=1)
            k=2;
        this.K = k;
    }

    public void add(T value){
        KAryNode newNode = new KAryNode(value);
        if( root == null){
            root = newNode;
            return;
        }
        Queue<KAryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            KAryNode currentNode = queue.poll();
            if(currentNode.children.size() < this.K){
                currentNode.addChild(newNode);
                return;
            }
            else {
                queue.addAll(currentNode.children);
            }
        }
    }

    public  KaryTree<String> fizzBuzzTree(KaryTree<Integer> kTree){
        KaryTree<String> tree = new KaryTree(kTree.K);
        String Value;
        Queue<KAryNode> queue = new LinkedList<>();
        if(kTree != null){
            queue.add(kTree.root);
            while(!queue.isEmpty()){

                KAryNode<Integer> Node = queue.poll();

                if(Node.value % 3 == 0 && Node.value % 5 ==0 )
                    Value = "FizzBuzz";
                else if((int)Node.value % 3 == 0)
                    Value="Fizz";
                else if((int)Node.value % 5 == 0)
                    Value="Buzz";
                else
                    Value=Node.value.toString();

                tree.add(Value);

                if(! Node.children.isEmpty())
                    queue.addAll(Node.children);
            }
        }
        return tree;
    }


    @Override
    public String toString() {
        return '{'+
                " "+ root +
                '}';
    }
}

