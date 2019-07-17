/**
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example 1:

Input: 1->2->3->4->5->NULL
Output: 1->3->5->2->4->NULL
Example 2:

Input: 2->1->3->5->6->4->7->NULL
Output: 2->3->6->7->1->5->4->NULL
Note:

The relative order inside both the even and odd groups should remain as it was in the input.
The first node is considered odd, the second node even and so on ...
 */
package com.ani.leetcode;

/**
 * 
 * 
 * @author aniket
 *
 */
public class OddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//test to generate a sample input
		ListNode input = new ListNode(1);
		ListNode head = input;
		for(int i=2;i<=5;i++) {
			input.next =  new ListNode(i);
			input = input.next;
	//		System.out.println("the value of i " +i );
			
		}
		//System.out.println("The input node is"+ head.value +"-->"+ head.next.value +"-->"+head.next.next.value);

		ListNode outputNode = oddEvenList(head);
		//System.out.println(outputNode.value);

		for(int i=0; i< 5; i++) {
		System.out.print(outputNode.value + "-->");
			outputNode = outputNode.next;
		}
		
	}
	



//A more elegant solution
/* 
 * Algo : keep 2 pointers : one pointing to even position and second pointing to odd position
 * 
 * odd =  odd.next.next;
 * even = even.next.next;
 * 
 * keep iterating till even!=null or even.next!=null // which essentially means that 
 * either the even is the last element or
 * odd is the last element
 * 
 * when the loop ends, point the last odd node to the first even node.
 * 
 * 
 * 1->2->3->4->5
 * 1->2->3->4
 * 
 * 
 * 
 */

	public  static ListNode oddEvenList(ListNode head) {

	  //declare the variables 
		
		if(head==null) {
			return head;
		}
		ListNode  even; ListNode odd;ListNode firstEven;
		even = head.next;
		odd=head;
		firstEven = head.next;
		
		while(even!=null && even.next!=null ) {// in case even is not the last item , and an odd item exists after that, then swap
			
			odd.next = odd.next.next;
			even.next = even.next.next;

			System.out.println("printing odd.next" + odd.next.value);
			odd= odd.next;
			even= even.next;
			
		}
		odd.next=firstEven;		
	
return head;}
}





//Algo could be , iterate till the end of the list and store the last node.
	//then assign the second node to last ->next.
	//something like  - last->next = head.next//and keep on moving at both steps : think further.

	/*public  static ListNode oddEvenList1(ListNode head) {
     
	int nodeNumber=1;
	ListNode initialNodePosition = head;
	ListNode lastNode=head;


	while(lastNode.next!=null) {
		lastNode = lastNode.next;//lastNode 
		nodeNumber++;//count the number of nodes
		//System.out.println("nodeNumber is" + nodeNumber);
	
	}
	nodeNumber= nodeNumber/2;

	//once the first and last node are sorted, just start swapping
	while((nodeNumber)>1) {
		lastNode.next = initialNodePosition.next;//1->2->3->4->5 ; 1->
		initialNodePosition.next = initialNodePosition.next.next;
		initialNodePosition = initialNodePosition.next;
		lastNode = lastNode.next;
		System.out.println("lastnode value" + lastNode.value);
		nodeNumber= nodeNumber/2;

	}

	return head;}*/


class ListNode{
	
	int value;
	ListNode next;
	ListNode(int value){
		this.value=value;
	} }

