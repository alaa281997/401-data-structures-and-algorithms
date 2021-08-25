package main.java.HashTable;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable<K, V> {
    private ArrayList<Node<K, V>> bucketArray;
    private int numBuckets;
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 30;
        size = 0;

        for (int index = 0; index < numBuckets; index++) {
            bucketArray.add(null);
        }
    }


    private int hashCode(K key) {
        return Objects.hashCode(key);
    }


    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);

        int index = hashCode % numBuckets;


        index = index < 0 ? index * -1 : index;

        return index;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void add(K key, V value) {

        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        Node<K, V> head = bucketArray.get(bucketIndex);

        // check if key present
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }

            head = head.next;
        }

        size++;
        head = bucketArray.get(bucketIndex);
        Node<K, V> newNode = new Node<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<Node<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;

            for (int index = 0; index < numBuckets; index++) {
                bucketArray.add(null);
            }

            for (Node<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }
    public boolean contains(K key) {
        if (key == null){
            throw new IllegalArgumentException("Cannot find a null key.");
        }
        return get(key) != null;
    }


    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        Node<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }

            head = head.next;
        }

        return null;
    }

}

