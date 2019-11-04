package com.ani.deque;

//

// Sample class to show see how Dequeue behaves in java.

//

//

//

import java.util.Deque;
import java.util.LinkedList;

public class DeQueue {


    public static void main(String[] args){
        Deque<Integer> sampleDeque = new LinkedList<>();
        sampleDeque.add(-1);
        sampleDeque.add(-3);




        /**
         * Inserts the specified element into the queue represented by this deque
         * (in other words, at the tail of this deque) **/

        sampleDeque.offer(8);
       // System.out.println("This will print the last element added in the queue:"+sampleDeque.peekLast());

        //System.out.println("This will print the first element added in the queue"+sampleDeque.peek());





    }
}
