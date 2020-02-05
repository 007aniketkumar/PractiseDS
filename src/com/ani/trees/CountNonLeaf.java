package com.ani.trees;

//Count the number of non-leaf nodes in a binary tree.



public class CountNonLeaf {


   static class TreeNode{
        TreeNode left;
        TreeNode right;
        int value;
    }

   static  int leftValue;
   static int rightValue;

    static TreeNode newNode(int data)
    {
        TreeNode node = new TreeNode();
        node.value = data;
        node.left = null;
        node.right = null;
        return (node);
    }

    static  int findNode(TreeNode root){

        if(root.left==null&&root.right==null||root==null){
            return 0;
    }
        //leftValue = findNode(root.left);
        //rightValue = findNode(root.right);
        //System.out.println("left:"+leftValue +"right"+rightValue);
        return findNode(root.left)+findNode(root.right)+1;


}


public static void main(String[] args){

    TreeNode root = newNode(1);
    root.left = newNode(2);
    root.right = newNode(3);
    root.left.left = newNode(4);
    root.left.right = newNode(5);

    System.out.println(findNode(root));
}

}
