package main.java.stack.and.queue;

public class pseudoQueue<T> {
    StackLinkedList<Integer> Stack1;
    StackLinkedList<Integer> Stack2;

    public pseudoQueue() {
        this.Stack1 = new StackLinkedList<Integer>();
        this.Stack2 = new StackLinkedList<Integer>();
    }

    public void enqueue(int value) {
        this.Stack1.push(value);
    }


    public int dequeue() {
        if (this.Stack2.top == null) {
            while (Stack1.top != null) {
                Stack2.push(Stack1.pop());
            }
        }
        return Stack2.pop();
    }

    @Override
    public String toString() {
        //will be full at enqueue and empty in dequeue
        if (Stack1.top == null)
            return Stack2.toString();

            //will be empty at enqueue and full in dequeue
        else if (Stack2.top == null)
            return Stack1.toString();
        else
            return "Empty";
    }
}