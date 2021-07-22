package main.java.stack.and.queue;

public class Node<T> {
    public Node<T> next;
    public  T data;

    public Node(T value) {
        this.data = value;
    }
}
