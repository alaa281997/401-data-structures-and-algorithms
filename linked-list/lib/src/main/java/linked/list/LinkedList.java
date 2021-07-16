package main.java.linked.list;
public class LinkedList <T>{
    public Node<T>  head;
    public int size;
    public LinkedList() {
        this.head = null;
    }
    public void insert(T value){
        Node<T> newNode = new Node<>(value);
        if(this.head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
        size++;
    }
    public void insertAfter(T value ,T newData){
        Node<T> newNode = new Node<>(newData);
        if(this.head == null) {
            head = newNode;
        }

        else {
            Node<T> node = head;
            while (node.value != value) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
        size++;
    }
    public void insertBefore(T value , T newData){
        Node<T> newNode = new Node<>(newData);
        if(this.head == null) {
            head = newNode;
        }  else if(value == head.value){
            newNode.next = head;
            head = newNode;
        }
        else {
            Node<T> node = head;
            while (node.next.value != value) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
        size++;
    }
    public void append (T value) {
        Node<T> newNode = new Node<>(value);
        if(this.head == null) {
            head = newNode;
        }
        else {
            Node<T> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        size++;
    }

    public boolean search(T value)
    {
        Node<T> node = head;
        while(node != null)
        {
            if (node.value == value)
                return true;
            node = node.next ;

        }
        return false;

    }


    // Code challenge 7

    public T kthFromEnd(int k){
        Node<T> temp = head;
        int newValue = size - 1 - k;
        int current = 0;
        if(k >= size || k < 0){
            return null;
        }else if (newValue == current){
            return temp.value;
        }else {
            while (newValue != current){
                temp = temp.next;
                current++;
            }
            return temp.value;
        }
    }

    // code challenge 8

    public static LinkedList zipLists(LinkedList list1, LinkedList list2){
        int size;
        Node n1 = list1.head;
        Node n2 = list2.head;
        LinkedList zipLists = new LinkedList();

        if(list1.size > list2.size){
            size = list1.size;
        }else if(list1.size< list2.size){
            size = list2.size;
        }else{
            size = list1.size;
        }
        while (size > 0){
            if(n1 != null){
                zipLists.append(n1.value);
                n1 = n1.next;
            }
            if(n2 != null){
                zipLists.append(n2.value);
                n2 = n2.next;
            }
            size --;
        }
        return zipLists;
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

