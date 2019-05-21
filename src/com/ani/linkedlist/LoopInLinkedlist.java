/**
 * 
 */
package com.ani.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aniket
 * 
 * Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer 
pos which represents the position (0-indexed) in the linked list where tail connects to. 
If pos is -1, then there is no cycle in the linked list.

 

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.



Example 2:

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.


Example 3:

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

 *
 */
public class LoopInLinkedlist {

	static int pos =1;//this shows the current position the tail connects to

	/**
	 * @param args
	 * 
	 * [3,2,0,-4], pos = 1// -4 is connected to 2(position 1)
	 */
	public static void main(String[] args) {
	
		ListNode head;
		ListNode nextNode;
		ListNode sampleInput =  new ListNode(3);
		sampleInput.next=new ListNode(2);
		nextNode =  sampleInput.next;
		nextNode.next = new ListNode(0);
		
		nextNode.next.next = new ListNode(-4);
		nextNode.next.next.next = sampleInput.next;//-4 connected to 1
		
		
		System.out.println(hasCycle(sampleInput));
	}
	
	
	
	
	
	
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	
	public static boolean hasCycle(ListNode head) {

		//let us try with 2 pointers 
		
		
		if(head==null||head.next==null) return false;
		
		ListNode fast = head.next.next;
		ListNode slow = head;
		
		while(fast!=null && fast.next!=null) {//till you have not reached the end
			if(fast==slow) {
				return true;
			} else {
				fast = fast.next.next;
				slow = slow.next;
			}
			
		}
		
		
		
		
		
		
		
		
		return false;
	}

}


class ListNode{
	int val;
	ListNode next;
	ListNode(int x) {
		val =x;
		next = null;
	}
}