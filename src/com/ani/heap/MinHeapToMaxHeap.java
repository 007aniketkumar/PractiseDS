package com.ani.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinHeapToMaxHeap {

	static int arr[] = {3, 5, 9, 6, 8};

	
	public static void main(String[] args) {
		
		
		//Print min heap
	//	Arrays.stream(arr).forEach(System.out::println);
		
		//call maxHeapify and then print the contents of the array post that.
		
		//choose the last non leaf node from the heap
		
		int n=arr.length;
		
		for(int i=n-2/2;i>=0;i--) {
			MaxHeapify(arr,i);
		}
		
		
		//Arrays.stream(arr).forEach(System.out::println);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("\r"+arr[i]);
		}
		
	}
	
	static void MaxHeapify(int arr[],int i) {
		
		int left = 2*i+1;
		int right = 2*i+2;
		
		//initially consider that root is the largest item.
		
		
		int largest=i;
		//base case
		//if(left>=arr.length && right>=arr.length) {
		//	return;
		//}
		
		
		//compare the left and right child against the root and find the largest amongst them
		
		if(left<arr.length && arr[left]>arr[largest]) {
			//left child is bigger
			largest= left;
		} else if(right<arr.length && arr[right]>arr[largest]) {
			largest = right;
		}
		
		
		if(largest!=i) { //swap the elements
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			MaxHeapify(arr,largest);

			
		}
		
		
		//the above swap may disturb the below heap composition , so call the heap recursively to fix it
		
		
	}
}
