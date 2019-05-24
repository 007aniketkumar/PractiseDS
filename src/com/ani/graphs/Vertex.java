package com.ani.graphs;

class Vertex{
	
	char value;
	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	boolean visited;
	
	Vertex(char value, boolean visited)
	{
		this.value = value;
		this.visited = visited;
	}
	
	
}