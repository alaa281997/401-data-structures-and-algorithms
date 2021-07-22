package main.java.stack.and.queue;

public class StackLinkedList<T> {
    Node top;
    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null)
            top = newNode;
        else {
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
    }

    public int pop() {
        int popElement = 0;
        if (top == null)
            System.out.println("Stack is Empty");
        else {
            popElement = (int) top.data;
            top = top.next;
        }
        return popElement;
    }
    public int peek() {
        if (top == null) {
            System.out.print(" empty stack ");
            return 0;
        } else
            return (int) top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        Node temp = this.top;
        StringBuilder output = new StringBuilder();
        if (temp == null) {
            return "NUll";
        }
        while (temp != null) {
            output.append("{ ").append(temp.data).append(" } -> ");
            temp = temp.next;
        }
        output.append("NULL");
        return output.toString();
    }
}
