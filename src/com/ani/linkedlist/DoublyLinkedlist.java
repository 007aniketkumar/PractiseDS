/**
 * 
 */
package com.ani.linkedlist;

/**
 * @author aniket
 *
 *
 *
 *A very basic program to test out Doubly linkedlist and its operations
 */
public class DoublyLinkedlist {

		
	/**
	 * @param args
	 */
	public static void main(String[] args) {//Driver method
		
		//create a sample DLL
		
		DLLNode d1= new DLLNode(1);
		d1.prev=null;
		DLLNode current;
		DLLNode head = d1;
		for(int i=2;i<=5;i++) {
			d1.next = new DLLNode(i);
			current = d1;
			d1 = d1.next;
			d1.prev = current;
		}
		
		
		while(head!=null) {
			System.out.println("Printing the current node content :" + head.value);
			if(head.prev==null) {
				//continue;
			} else {
			System.out.println("printing the previous nodes::" + head.prev.value);
			
			}
			head=head.next;

		}
	}

	
	//Insertion in dll
	
	public void insert(DLLNode node) {
		
	}
	
	
	//Delettion in DLL
	public DLLNode deleteNode() {
		
	return null;}
	
	
	//find a node 
	
}

//2 pointers pointing to next and prev
 class DLLNode {
	 
	 DLLNode next;
	 DLLNode prev;
	 int value;
	 DLLNode(int value) {
		 this.value = value;
	 }
}
