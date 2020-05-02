package com.company;

public class Stack<T> {
    private int maxSize;
    private long[] stackArray;
    private int top;


    public Stack(int size){
        this.maxSize = size;
        stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long item){
       if(!isFull()){
           top++;
           stackArray[top] = item;
       }else {
           throw new RuntimeException("Stack is full");
       }
    }

    public long pop(){
       if(!isEmpty()){
           int poppedTopIndex = top;
           top--;
           return stackArray[poppedTopIndex];
       }else{
            throw new RuntimeException("Stack is empty");
       }
    }

    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return ((maxSize -1) == top);
    }


}
