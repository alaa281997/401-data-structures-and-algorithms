package main.java.stack.and.queue;

public class QueueLinkedList<T> {
    public Node<T> front, rear;

    public QueueLinkedList() {
        this.front = this.rear = null;
    }

    public void enqueue(T value) {
        Node newNode = new Node(value);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public T dequeue() {
        if (this.front == null) {
            System.out.println("The queue is empty");
            return (T) "Empty";
        } else {
            Node<T> temp = this.front;
            this.front = this.front.next;
            return temp.data;
        }
    }
    public T peek() {
        if (front == null) {
            System.out.println("Empty queue");
            return (T) "Empty";
        } else
            return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        Node temp = this.front;
        StringBuilder output = new StringBuilder();
        if (temp == null) {
            return "empty queue";
        }
        while (temp != null) {
            output.append("{ ").append(temp.data).append(" } -> ");
            temp = temp.next;
        }
        output.append("NULL");
        return output.toString();
    }

}
