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

package com.ani.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author aniket
 * *Updated the directory structure of remote repo

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
		int[] coins = new int[]{2,5};
		//int[] coins = new int[]{186,419,83,408};
		int amount =	18;

		//int amount=3;
		System.out.println(coinChange(coins,amount));
		System.out.println(coinChangeDP(coins,amount));

		
		
	}
	
	
	/*
	 * The solution fails for a number of cases
	 * 
	 * like for [2,5] =18
	 * ans is 8, will return 9.
	 * 
	 * 
	 */
	
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
    
    
    
    
    
    /*
     * 
     * Let's try the dynamic programming way
     * 
     * 
     * The logic is to compute all the values till the sum, bottom up approach
     * 
     * Like min coins to compute 1,2,3,4,.. adding all the way to sum.
     *  
     * There will be duplicate encountered based on the coins denominations, 
     * hence we use an array 
     * 
     *  logic is simple , iterate over this array, and check if the sum for that index , 
    	 *  is fulfilled by coin denominations
     * 
     * 
     * amount > coin 
     * 
     */
    		
    public static int coinChangeDP(int[] coins, int amount) {

    int[] sumArray =  new int[amount+1]; 
    /* since the index starts from 0, and we are interested in denominations of amount,
    *hence we need to iterate till amount +1*/
    
    for(int i=1;i<=amount;i++) //iterate till the end of the array
    	{    int min=Integer.MAX_VALUE;

    		for(int coin:coins) {//check against each coin
    			if(i>=coin && sumArray[i-coin]!=-1) {
    				min=Math.min(sumArray[i-coin], min); 
    			}
    			
    		}
    		sumArray[i] = min==Integer.MAX_VALUE?-1:min+1;//+1 for using the current coin denomination
    	
    	
    	}
    return sumArray[amount];
    
   }

}

