package com.learn.ds;

public class QueueMain {

    public static void main(String[] args) {

        Queue theQueue = new Queue(5);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.insert(50);

        theQueue.view();

        theQueue.remove();
        theQueue.remove();
        //theQueue.view();

        System.out.println(theQueue.peekFront());;


    }

}
