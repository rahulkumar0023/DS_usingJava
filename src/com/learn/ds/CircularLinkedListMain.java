package com.learn.ds;

public class CircularLinkedListMain {

    public static void main(String[] args) {

        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertLast(999);

        myList.displayList();

    }
}
