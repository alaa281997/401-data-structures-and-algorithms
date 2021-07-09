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

}
