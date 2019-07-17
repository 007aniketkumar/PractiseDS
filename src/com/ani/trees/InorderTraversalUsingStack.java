package com.ani.trees;

import java.util.Stack;

public class InorderTraversalUsingStack {

    static Stack<Node> inorderStack = new Stack<Node>();

    public static void main(String args[]) {

        //

        //  50

        //40      70

        //30 45  60   80

        //create Binary tree

        //Binary tree construction∆

        Node binaryTree =  new Node(50);
        binaryTree.setLeftChild(new Node(40));
        binaryTree.setRightChild(new Node(70));
        binaryTree.leftChild.setLeftChild(new Node(30));
        binaryTree.leftChild.setRightChild(new Node(45));
        binaryTree.rightChild.setLeftChild(new Node(70));
        binaryTree.rightChild.setRightChild(new Node(80));
        binaryTree.rightChild.setLeftChild(new Node(60));

        //try printing the binary tree

        inorderTraversal(binaryTree);

    }



    static void inorderTraversal(Node binaryTree) {

        //start from the root node
        //check if the binaryTree has only one node
        if (binaryTree == null) {
            System.out.println("nothing to traverse");

        }

        //inorder traversal follows Left -> Root - > right

        //put the root in stack first:

        inorderStack.push(binaryTree);
        Node currentNode = binaryTree;
        //now keep iterating towards the left side

        while (!inorderStack.empty()) {

            while (currentNode != null) {
                currentNode = currentNode.leftChild;
                inorderStack.push(currentNode);
            }

            //once you have reached the end of while loop, pop the last item from the stack and print the left most child

            currentNode = inorderStack.pop();
            System.out.println(currentNode.data);

            //also iterate on the right side of the popped item , the popped left child can have right children of its own.

            while (currentNode.rightChild != null) {
                currentNode = currentNode.rightChild;
                inorderStack.push(currentNode);
            }
        }


    }


}



