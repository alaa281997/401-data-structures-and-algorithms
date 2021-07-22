package main.java.stack.and.queue;

public class AnimalShelter {
    public QueueLinkedList<Cat> cat;
    public QueueLinkedList<Dog> dog;

    public AnimalShelter() {
        this.cat = new QueueLinkedList<>() ;
        this.dog = new QueueLinkedList<>();
    }


    public void enqueue(Animal animal){
        if (animal instanceof Cat){
            this.cat.enqueue((Cat)animal);
        }else if (animal instanceof Dog){
            this.dog.enqueue((Dog) animal);
        }
    }

    public Animal dequeue(String pref){
        if(pref.equals("cat") && ! cat.isEmpty()){
            return cat.dequeue();
        }else if (pref.equals("dog") && ! dog.isEmpty()){
            return dog.dequeue();
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "{ catQueue=" + cat +"} ,"+
                "{ dogQueue=" + dog +
                '}';
    }
}
