/**
 * You are given coins of different denominations and a total amount of money amount. 
 * Write a function to compute the fewest number of coins that you need to make up that amount. 
 * If that amount of money cannot be made up by any combination of the coins, return -1.

	Example 1:

	Input: coins = [1, 2, 5], amount = 11
	Output: 3 
	Explanation: 11 = 5 + 5 + 1
	Example 2:

	Input: coins = [2], amount = 3
	Output: -1
	Note:
	You may assume that you have an infinite number of each kind of coin.
 */

package com.ani.leetcode.linkedlist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author aniket
 *
 *
 *Solution : This is similar to maximum sum problem , create 2 pointers 
 *
 *one pointing to start of the array, and the other which will move head, and 
 *then a hashmap to store the combination(if needed)
 *
 */
public class CoinChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//int[] coins = new int[]{1,2,5};
		//int[] coins = new int[]{2};
		int[] coins = new int[]{186,419,83,408};
		int amount =	6249;

		//int amount=3;
		System.out.println(coinChange(coins,amount));
		
		
	}
	
    public static int coinChange(int[] coins, int amount) {
    
    	int startPointer = coins.length-1;
    	int currentPointer = coins.length-1;
    	int minSumCoins =-1 ;
    	int currentSum=0;
    	int newAmount;
    Arrays.sort(coins);
    	
    	while(startPointer>=0) {
    		currentPointer=startPointer;
    		newAmount=amount;
    		currentSum=0;
    		while(newAmount!=0 && currentPointer>=0 ) {//either you reach the end or find the value
    			if(newAmount>=coins[currentPointer]) {
    				newAmount =  newAmount-coins[currentPointer];
    				currentSum++;
    				} 
    			else {
    				currentPointer--;
    			}
    		}
    		startPointer--;
    		if(newAmount==0) {
    			//set the value of sum of coins ,else discard
    			minSumCoins = minSumCoins==-1 ? currentSum :Math.min(currentSum, minSumCoins);

    		}
    		
    	}
    return minSumCoins;}
    }



