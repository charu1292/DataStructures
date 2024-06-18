package LinkedList;

import java.util.*;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;

    }
}


public class CreateLinkedList {

    public static LinkedList<String> createList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("this");
        list.add("is");
        list.add("linked");
        list.add("list");
        return list;
    }

    public static void main(String[] args) {
        LinkedList<String> list = createList();
        System.out.println(list);
    }
}