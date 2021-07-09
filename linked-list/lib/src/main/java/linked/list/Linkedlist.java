package main.java.linked.list;

public class Linkedlist {
    public Node head;
    public int size;

    public Linkedlist(Node head) {
        this.head = head;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        if(this.head != null) {
            Node tmp = head;
            head = newNode;
            head.next = tmp;

        }
        else {
            head = newNode;

        }size++;

    }

    public boolean search(Node head, int value)
    {
        Node node = head;
        while (node != null)
        {
            if (node.value == value)
                return true;
            node = node.next ;

        }
        return false;

    }


    public String toString(){
        String result = "";
        Node n = head;


        while(n != null){

            result +="{";
            result += n.value;
            result +="}";

            result += " -> ";

            n = n.next;

        }
        result += "Null";
        return "List: " + result;
    }

    /*Code Challenge 6 Linked List insertions*/

    public void append (int value) {
        Node newNode = new Node(value);
        if(this.head != null) {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        else {
           head = newNode;
        }
        size++;

    }

    public void insertBefore(int value , int newValue){
        Node newNode = new Node(newValue);
        if(this.head != null) {
            Node crr = head;
           if (crr.next.value == value && crr.next != null){
                newNode.next = crr.next;
                crr.next = newNode;
            }
        }
        else {
            head = newNode;
        }
        size++;
    }
    public void insertAfter(int value ,int newValue){
        Node newNode = new Node(newValue);
        if(this.head == null) {
            head = newNode;
        }
        else {
            Node tmp = head;
            while (tmp.value != value && tmp.next != null) {
                tmp = tmp.next;
            }
            if (tmp.value == value) {
                newNode.next = tmp.next;
                tmp.next = newNode;
            }
        }
        size++;

    }
}
