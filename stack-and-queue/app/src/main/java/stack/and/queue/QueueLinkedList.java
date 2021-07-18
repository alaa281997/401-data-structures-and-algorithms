package main.java.stack.and.queue;

public class QueueLinkedList<T> {
    public Node front, rear;

    public QueueLinkedList() {
        this.front = this.rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public int dequeue() {
        if (this.front == null) {
            System.out.println("The queue is empty");
            return Integer.MIN_VALUE;
        } else {
            Node temp = this.front;
            this.front = this.front.next;
            return temp.data;
        }
    }
    public int peek() {
        if (front == null) {
            System.out.println("Empty queue");
            return Integer.MIN_VALUE;
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
