package com.learn.ds;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(int data){

        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first; // new node --> old first
        first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data =data;

        if(isEmpty()){
            first = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }

    }

    public int deleteFirst(){
        int temp = first.data;
        if(first.next == null){
            last = null;
        }
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

    private boolean isEmpty() {
        return (first == null);
    }

}
