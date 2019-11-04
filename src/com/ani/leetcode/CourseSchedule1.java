/**
 * 
 */
package com.ani.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * @author aniket
 *
 *
 *
 *      There are a total of n courses you have to take, labeled from 0 to n-1.

		Some courses may have prerequisites, for example to take course 0 you have to first take course 1, 
		which is expressed as a pair: [0,1]

		Given the total number of courses and a list of prerequisite pairs, 
		is it possible for you to finish all courses?
 */
public class CourseSchedule1 {

	
	public static boolean canJump(int[] nums) {
	    
		int currentJump=0;
        int nextIndex=0;
        int end = nums.length-1;
        Map<Integer,Integer> jumpsIndex=new HashMap<>();
        
                                        if(nums.length==1){
            return true;
        }
        if(nums==null||nums[0]==0){
            return false;
        }
        
        for(int i=0;i<nums.length;i++) {
         for(int k=1;k<=nums[nextIndex];k++){
        	 

        	 int res=k+nextIndex;
        	 System.out.println("res::"+res);
        	 //check if k+nextIndex is less than nums.length
             if(k+nextIndex>=nums.length)
                 return true;
        	 			currentJump = nums[k+nextIndex];
        	 			jumpsIndex.put(currentJump,k+nextIndex);
        	 			
        	 		} 
         
         //sort out and find the maximum max from the map
         int maxKey =   jumpsIndex.keySet().stream().max(Integer::compare).orElse(0);
         
         
             nextIndex = jumpsIndex.get(maxKey); // this will return the index of the maximum item.
             System.out.println("Max key :"+maxKey + "nextIndex :" + nextIndex);
             jumpsIndex.clear();//clear the map
             
                if(nextIndex>=end) {
                    return true;
                }if(maxKey==0)
        	 return false; 
                }
                
                
    return false;}  // if the entire array is complete but the answer is still not achieved , so return false
	
	
	
	public static void main(String[] args) {
		
		int nums[] = {2,3,1,1,4};
		int nums1[] = {2,3,1,1,0,4};
		int nums3[] = {5,9,3,2,1,0,2,3,3,1,0,0};
		int nums4[] = {4,2,0,0,1,1,4,4,4,0,4,0};

				
				
				System.out.println(canJump(nums4));
	}
}
