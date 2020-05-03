package com.learn.ds;

public class SInglyLinkedListMain {
    public static void main(String[] args) {

        SinglyLinkedList myList = new SinglyLinkedList();

        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertLast(999);

        myList.displayList();
    }
}
