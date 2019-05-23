/**
 * 
 */
package com.ani.graphs;

import java.util.LinkedList;

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
	static LinkedList<Vertex> graphList[];
	
	static Vertex[] vertices;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		graphList =  new LinkedList[4];
		vertices = new Vertex[4];
		createGraph();
		Print();
		
	}
	
	/*
	 * This method specifies the 
	 * 
	 * 
	 */
	static void addEdge(int index, Vertex to) {
		graphList[index].add(to);
		
	}
	
	static void createGraph() {
	
		//each vertex is a linked list
		//initalise
		
		for(int i =0;i<graphList.length;i++) {
			graphList[i] = new LinkedList<Vertex>();
		}
		
		//create vertex
		
		Vertex v0 =  new Vertex(0,false);
		Vertex v1 =  new Vertex(1,false);
		Vertex v2 =  new Vertex(2,false);
		Vertex v3 =  new Vertex(3,false);

		
		


		addEdge(0,v1);
		addEdge(2,v0);
		addEdge(0,v2);
		addEdge(2,v3);
		addEdge(3,v3);
	}

	
	
	static void Print() {
		System.out.println("sie of LL :" + graphList.length);
		for(int i=0;i<graphList.length;i++) {
			System.out.println("Connections at :" +i);
		graphList[i].forEach(Vertex -> System.out.println(Vertex.getValue()));
		}}
	}



 
