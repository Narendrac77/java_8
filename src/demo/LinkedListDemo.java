package src.demo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void linkedListDemo2() {
        List<String> linkedList = Collections.synchronizedList(new LinkedList<>());
        linkedList.add("Narendra");
        linkedList.add("Balaji");
        for (String s : linkedList) {
            System.out.println(s);
            linkedList.add("Bala Chandra");
        }

    }

    public static void main(String[] args) {
        LinkedListDemo linkedListDemo = new LinkedListDemo();
        linkedListDemo.linkedListDemo2();
    }
}