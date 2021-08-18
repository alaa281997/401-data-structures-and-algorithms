package main.java.HashTable;

public class Node<K, V>  {
    K key;
    V value;

    final int hashCode;

    Node<K, V> next;

    public Node(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}
