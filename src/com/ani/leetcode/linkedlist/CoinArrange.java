/**
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
 */
package com.ani.leetcode.linkedlist;

/**
 * @author aniket
 *
 */
public class CoinArrange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	System.out.println(arrangeCoins(2));
		
	}
	
    public static int arrangeCoins(int n) {
    
    	//n is the number of coins
    	int stairs=1;
    	while(n > stairs) {
    		n = n-stairs;
    		stairs++;
    	}
    	stairs = (n-stairs)<0?(stairs-1):stairs;
   return stairs;
   }

}
