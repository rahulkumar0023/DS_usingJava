package com.learn.ds;

public class SinglyLinkedList {

    private Node first;

    public SinglyLinkedList() {
    }

    public boolean isEmpty(){
        return (first == null);
    }

    //used to insert at the beginning
    public void insertFirst(int data){

        //making new node and assigning data
        Node newNode = new Node();
        newNode.data = data;

        //updating references
        newNode.next = first; //old first node which is second now
        first = newNode; // engine references to the first node


    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first --> last)");

        Node currentNode = first;

        System.out.print("Head");
        while (currentNode != null){
            System.out.print (" -> " + currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.print(" -> Tail");

    }

    public void insertLast(int data){
        Node current = first;
        while (current.next != null){
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
         current.next = newNode;
    }

}
