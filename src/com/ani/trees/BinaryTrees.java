/**
 * 
 */
package com.ani.trees;

/**
 * @author aniket
 *
 *
 *basic tree iteration
 *
 *treeNode {
 *
 *treeNode nodeleft
 *treeNode nodeRight
 *int value
 *
 *
 *}
 *
 */
public class BinaryTrees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		treeNode root =null; //= new treeNode(4);
		treeNode.insertNode(root, 4);
	//	treeNode.insertNode(root, 5);

	//	treeNode.insertNode(root, 6);
		

		
	}

}


class treeNode {
	
	treeNode left;
	treeNode right;
	int value;
	treeNode(int value) {
		this.value = value;
	}
	
	//create a pointer rootNode
	static treeNode root;
	
	//Program to insert a node, find the height of tree , search a node in tree

 static void insertNode(treeNode root,int value) {
	 
	 //this is not a BST , so insert at any location which is free, starting from root
	 
	 
	 if(root==null) {
		 root= new treeNode(value);
		 System.out.println("value inserted" + root.value );
		 root.printTree(root);

		 return;//exit after the insertion
	 }
	 

	 //recursively call the insert method to insert in the left or right side
	 
	 insertNode(root.left,value);
	 insertNode(root.right,value);
	 
	 
 }
 
  void printTree(treeNode root) {
	 
	 if(root==null) {
		 return;
	 }
	 while(root!=null) {
		 System.out.println("value is "+root.value);
		 System.out.println("after this statement");
		 printTree(root.left);
		 printTree(root.right);
	 }
 }
 

}



