package com.learn.ds;

public class NodeMain {

    public static void main(String[] args) {

        Node nodeA = new Node();
        Node nodeB = new Node();
        Node nodeC = new Node();
        Node nodeD = new Node();

        //node A data and next reference
        nodeA.data = 4;
        nodeA.next = nodeB;

        //node B data and next reference
        nodeB.data = 3;
        nodeB.next = nodeC;

        //node C data and next reference
        nodeC.data = 7;
        nodeC.next = nodeD;

        //node D data and next reference
        nodeD.data = 8;

        System.out.println(listLength(nodeA));
    }
    static int length = 1;
    public static int listLength(Node n){
        if(n.next == null){
            return 1;
        }else{
            length++;
            listLength(n.next);
        }
        return length;
    }

}
