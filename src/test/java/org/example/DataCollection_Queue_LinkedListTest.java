package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

public class DataCollection_Queue_LinkedListTest extends LinkedList implements Queue, Collection {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void main() {

        Queue<String> waitqueue = new LinkedList<>();

        // add elements to the queue
        waitqueue.add("Peace");
        waitqueue.add("Hope");
        waitqueue.add("Love");
        waitqueue.add("Joy");

        //test 4 items
        assertEquals(4,waitqueue.size());




    }
}