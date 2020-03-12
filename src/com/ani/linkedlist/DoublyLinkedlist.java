/**
 *
 */
package com.ani.linkedlist;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import sun.jvm.hotspot.debugger.windbg.DLL;

/**
 * @author aniket
 *
 * Mutliple add and delete scenarios exist.
 *
 * A very basic program to test out Doubly linkedlist and its operations
 *
 * Add from the begining  - from the head
 *
 * Add at the end
 *
 * Delete from the begining
 *
 * Delete at the end
 *
 *
 */
public class DoublyLinkedlist {

    /* A doubly LL has a head and Tail
     * Insertion happens through Head
     * Deletion through the tail  */

    private DLLNode head;
    private DLLNode tail;


    DoublyLinkedlist() {
        head = new DLLNode();
        tail = new DLLNode();
        head.prev = null; //first node of DLL
        tail.next = null;//last node of DLL
        head.next = tail;
        tail.prev = head;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {//Driver method


        DLLNode d1 = new DLLNode();
        d1.value = 1;
        DLLNode d2 = new DLLNode();
        d2.value = 2;
        DLLNode d3 = new DLLNode();
        d3.value = 3;

        DoublyLinkedlist doublyLinkedlist = new DoublyLinkedlist();

        doublyLinkedlist.addFromBegining(d1);
        doublyLinkedlist.addFromBegining(d2);
        doublyLinkedlist.addFromBegining(d3);

        doublyLinkedlist.display();
       doublyLinkedlist.removeFromTheEnd();

        doublyLinkedlist.display();
       doublyLinkedlist.removeFromTheEnd();
        doublyLinkedlist.display();
        DLLNode removeNode2 = new DLLNode();
        removeNode2.value=2;
       // doublyLinkedlist.removeParticularNode(removeNode2);

        DLLNode removeNode1 = new DLLNode();
        removeNode1.value=1;
       // doublyLinkedlist.removeParticularNode(removeNode1);

        DLLNode removeNode3 = new DLLNode();
        removeNode3.value=3;
        doublyLinkedlist.removeParticularNode(removeNode3);

        doublyLinkedlist.display();


    }


    //Insertion in dll


    public void addFromBegining(DLLNode newNode) {

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }


        head.prev = newNode;
        newNode.next = head;
        newNode.prev = null;
        head = newNode;

    }


    /* Delete a  node from the end of a list.



     */
    public DLLNode removeFromTheEnd() {
        //remove the last node

        DLLNode temp = tail;
        tail = tail.prev;
        tail.next = null;
        return temp;
    }

    /*
     *
     * Remove a desired node from the list
     */

    public boolean removeParticularNode(DLLNode node){
        DLLNode current = head; //to search for the particular node in DLL
        DLLNode result=null;

        if(node.value==head.value){
            head= head.next;
            head.prev=null;
            return true;
        }

        if(node.value==tail.value){

            tail= tail.prev;
            tail.next=null;
            return true;
        }

        while(current!=null){
            if(current.value==node.value){//value found
                //need to handle tail and head carefully
                current.prev.next = current.next;
                current.next.prev = current.prev;
                current.next=null;
                current.prev=null;//discarding the current node
                return true;
            }
           current = current.next;
        }
    return false;
    }


    public void display() {
        //from the head
        DLLNode current = head;
        System.out.println("\n");
        while (current != null) {
            System.out.print(" " + current.value);
            current = current.next;
        }

    }


    //2 pointers pointing to next and prev
    static class DLLNode {

        DLLNode next;
        DLLNode prev;
        int value;
    }
}