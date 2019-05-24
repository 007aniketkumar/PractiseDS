/**
 * 
 */
package com.ani.graphs;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author aniket
 * 
 * 
 * 
 * This is to create a graph using a LinkedList and then do a Depth first traversal using a stack.
 * 
 * 
 *
 */
public class DFS {
	
	
	//array of linkedlist
	static LinkedList<Integer> graphList[];
	
	static Vertex[] vertices;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		graphList =  new LinkedList[4];
		vertices = new Vertex[4];
		createGraph();
		Print();
		
		DFS();
		
	}
	
	/*
	 * This method specifies the 
	 * 
	 * 
	 */
	static void addEdge(int index, int to) {
		graphList[index].add(to);
		
	}
	
	static void createGraph() {
	
		//each vertex is a linked list
		//initalise
		
//create vertex
		
		Vertex v0 =  new Vertex('A',false);
		Vertex v1 =  new Vertex('B',false);
		Vertex v2 =  new Vertex('C',false);
		Vertex v3 =  new Vertex('D',false);

		
		
		for(int i =0;i<graphList.length;i++) {
			graphList[i] = new LinkedList<Integer>();
		}
		
	// initalise the vertices at each positions
		
		vertices[0]=v0;
		vertices[1]=v1;
		vertices[2]=v2;
		vertices[3]=v3;
		


		addEdge(0,1);
		addEdge(2,0);
		addEdge(0,2);
		addEdge(2,3);
		addEdge(3,3);
	}

	
	
	static void Print() {
		System.out.println("sie of LL :" + graphList.length);
		for(int i=0;i<graphList.length;i++) {
			System.out.println("Connections at :" +i);
			graphList[i].forEach(Integer->System.out.println(Integer.intValue()));
		}}
	
	
	/*
	 * 
	 * Do Depth first search, start from any node , and then print all 
	 * unvisited node pushing them in the stack one by one
	 * 
	 * 
	 */
	static void DFS() {
		
	//pick the starting index say 0;
		
		Stack<Integer> stackofPostions = new Stack<>();
		int startingIndex = 0;
		vertices[startingIndex].visited=true;
		System.out.println(vertices[startingIndex].value);//print the starting vertex
		int unvisitedPostion=-1;
		stackofPostions.push(startingIndex);
		
		while(!stackofPostions.empty()) {
			unvisitedPostion = unvisitedPostion(stackofPostions.peek());

			if(unvisitedPostion!=-1) {
				
				//display the result
				
				System.out.println(vertices[unvisitedPostion].value);
				//mark this as visited
				vertices[unvisitedPostion].visited=true;
				stackofPostions.push(unvisitedPostion);//push it on the stack
				

			} else {
				//pop the item from the stack
				stackofPostions.pop();
			}
			
			
		}
		
		
	}
	
	
	
	static int unvisitedPostion(int currentPosition) {
		int unvisitedPostion=-1;
		
		for(int i=0;i<graphList[currentPosition].size();i++) {//iterate over the linkedlist
			if(!(vertices[graphList[currentPosition].get(i)].visited)) {
				return graphList[currentPosition].get(i);
			}
		}
		
		return unvisitedPostion;}
	
	
	
	
	}



 
