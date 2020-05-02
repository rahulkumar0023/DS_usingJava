package com.company;

public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int itemsInTheQueue;

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        itemsInTheQueue = 0;
    }

    public void insert(long item){
        if(rear ==  (maxSize-1)){
            rear = -1;
        }

            rear++;
        queueArray[rear] = item;
        itemsInTheQueue++;
    }

    public long remove(){
        long removedItem = queueArray[front];
        front++;
        if(front == maxSize){
            front = 0 ;
        }
        itemsInTheQueue--;
        return removedItem;
    }

    public long peekFront(){
        return queueArray[front];
    }

    public void view(){
        for(int i = 0 ; i < queueArray.length ; i++){
            System.out.print(queueArray[i] + " " );
        }
        System.out.println();
    }



    public boolean isEmpty(){
        return (front == 0);
    }

    public boolean isFull(){
        return (front == (maxSize=1));
    }
}
