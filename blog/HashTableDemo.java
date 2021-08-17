package main.HashTable;

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable<String> hash = new HashTable<String>(10);
        hash.put(10,"hussein");
        hash.put(11,"Jena");
        hash.put(5,"111");

        System.out.println(hash.Get(5));
    }
}
