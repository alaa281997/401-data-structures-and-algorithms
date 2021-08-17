package main.HashTable;

public class HashTable<T> {
    Node[] array;
    int size;
    public HashTable(int size){
        this.size=size;
        array = new Node[this.size];
        for (int i = 0; i <array.length ; i++) {
            array[i] = new Node<T>();
        }
    }
    int getHash(int key){
      return key%size;
    }
    public void put(int key,T value){
        int index = getHash(key);
        Node ArrayValue =array[index];
        Node newItem = new Node<T>(key,value);  //
        newItem.next = ArrayValue.next;
        ArrayValue.next = newItem;
    }
    public T Get(int key){
        T value = null;
        int index = getHash(key);
        Node ArrayValue2 = array[index];
        while (ArrayValue2!=null){
            if(ArrayValue2.getKey() == key){
                value= (T) ArrayValue2.value;
                break;
            }
            ArrayValue2=ArrayValue2.next;
        }
        return value;
    }
}
