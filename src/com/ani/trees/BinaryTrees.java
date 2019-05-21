/**
 * 
 * 
 * This is a full blown balanced binay tree , something like
 *       4
 *     5  5
 *   6 6 6 6
 * 
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
		root = treeNode.insertNode(root, 4);
		treeNode someNodeWhichIDoNotNeed;
		someNodeWhichIDoNotNeed = treeNode.insertNode(root, 5);

		someNodeWhichIDoNotNeed= treeNode.insertNode(root, 6);
		

		
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
	
	//Program to insert a node, find the height of tree , search a node in tree

 static treeNode insertNode(treeNode root,int value) {

	 
	 //this is not a BST , so insert at any location which is free, starting from root
	 
	 
	 if(root==null) {
		 root= new treeNode(value);
		// System.out.println("value inserted" + root.value );
		 root.printTree(root);

		 return root;//exit after the insertion
	 }
	 

	 //recursively call the insert method to insert in the left or right side
	 
	 root.left=insertNode(root.left,value);
	 root.right=insertNode(root.right,value);
	 
	 return root;
 }
 
  void printTree(treeNode root) {
	 
	 if(root==null) {
		 return;
	 }
	 if(root!=null) {
		 System.out.println(root.value);
		 printTree(root.left);
		 printTree(root.right);
	 }
 }
 

}



