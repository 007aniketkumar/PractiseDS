package com.ani.graphs;

class Vertex{
	
	int value;
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	boolean visited;
	
	Vertex(int value, boolean visited)
	{
		this.value = value;
		this.visited = visited;
	}
	
	
}