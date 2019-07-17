/**
 * 
 */
package com.ani.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author aniket
 *
 *
 *The difference between DFS and BFS is choice of Data structure , in BFS we use a queue.
 * adding comment to bring it in sync with master repo
 */
public class BFS {
	
	
	// List of vertices

	static Vertex[] vertices = new Vertex[5];

	// initialise vertex
	static void initialiseVertex() {
		vertices[0] = new Vertex('A', false);
		vertices[1] = new Vertex('B', false);
		vertices[2] = new Vertex('C', false);
		vertices[3] = new Vertex('D', false);
		vertices[4] = new Vertex('E', false);

	}
 
 
	static LinkedList<Integer>[] connections = new LinkedList[5] ;
	
	//initialise list
	static void initialiseList() {
		for(int i=0;i<connections.length;i++) {
			connections[i] = new LinkedList();
		}
	}
	
	
	//create the graph using the vertex class
	static void addEdge(int from, int to) {
		connections[from].add(to);
	}
	
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		initialiseVertex();
		initialiseList();
		addEdge(0,1);
		addEdge(0,2);
		addEdge(0,4);
		addEdge(2,3);

		performBFS();
		
		
	}
	
	
	
	
	/*
	 * 
	 * 
	 * 
	 */
	
	static void performBFS() {
		
		
		Queue<Integer> pos = new LinkedList<Integer>();
		//choose any valid position to start with, say 0;
		
		int startingPoint =0;
		vertices[startingPoint].visited=true;
		pos.add(startingPoint);
		System.out.println(vertices[startingPoint].value);
		
		while(!pos.isEmpty()) {
			
			startingPoint =  findUnvisited(pos.peek());
			
			if(startingPoint!=-1) {
				pos.add(startingPoint);
				System.out.println(vertices[startingPoint].value);
			} else {
				pos.poll();
			}
		}
		
	}
	
	
/*
 * This will find the first unvisited node if found , else return false
 * 
 * 
 * 
 * 
 */
	
	static int findUnvisited(int pos) {

		LinkedList<Integer> connection = connections[pos];

		// iterate over the linkedlist , to check if an element exists , and if it does
		// check if it is unvisited

		for (int j = 0; j < connection.size(); j++) {
			if (!vertices[connection.get(j)].visited) {
				//mark this as visited before returning
				vertices[connection.get(j)].visited = true;
				return connection.get(j);
			}

		}
		return -1;
	}
}
