package org.example;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class DataCollection_Queue_LinkedList extends LinkedList implements Queue, Collection {

    public  void main(String[] args) {

        Queue<String> waitqueue = new LinkedList<>();

        // add elements to the queue
        waitqueue.add("Peace");
        waitqueue.add("Hope");
        waitqueue.add("Love");
        waitqueue.add("Joy");

        System.out.println(waitqueue);

        //remove element from queue using poll
        String values = waitqueue.poll();
        System.out.println("removed from original is " +values+"     |New after removal  :  "+waitqueue);




    }

}
