/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package main.java.linked.list;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.insert(2);
        ls.insert(4);
        ls.insert(5);
        ls.insert(9);
        ls.insert(6);

        System.out.println(ls.kthFromEnd(2));
        //ls.insertBefore(5 , 1);
        System.out.println(ls);


    }
}