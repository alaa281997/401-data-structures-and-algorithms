/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test.java.linked.list;

import main.java.linked.list.Library;
import main.java.linked.list.Node;
import org.junit.Test;

import java.util.LinkedList;
import  main.java.linked.list.Linkedlist;
import static org.junit.Assert.*;

public class LibraryTest {
    Linkedlist ls = new Linkedlist(new Node(10));
    @Test
    public void testInsert() {
        ls.insert(11);
        ls.insert(12);
        assertEquals(2 , ls.size);
    }

    @Test
    public void testSearch() {
        ls.search(ls.head, 10);
        assertFalse(false);
    }
}