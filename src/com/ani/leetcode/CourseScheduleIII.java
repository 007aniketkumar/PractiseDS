/**
 * 
 */
package com.ani.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author aniket
 *
 *
 *There are n different online courses numbered from 1 to n. Each course has some duration(course length) t and closed on dth day. A course should be taken continuously for t days and must be finished before or on the dth day. You will start at the 1st day.

Given n online courses represented by pairs (t,d), your task is to find the maximal number of courses that can be taken.

Example:

Input: [[100, 200], [200, 1300], [1000, 1250], [2000, 3200]]
Output: 3
Explanation: 
There're totally 4 courses, but you can take 3 courses at most:
First, take the 1st course, it costs 100 days so you will finish it on the 100th day, and ready to take the next course on the 101st day.
Second, take the 3rd course, it costs 1000 days so you will finish it on the 1100th day, and ready to take the next course on the 1101st day. 
Third, take the 2nd course, it costs 200 days so you will finish it on the 1300th day. 
The 4th course cannot be taken now, since you will finish it on the 3300th day, which exceeds the closed date.
 */


public class CourseScheduleIII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//prepare the input
		
		int[][] courses = {{100,200},
						   {200,1300},
						   {1000,1250},
						   {2000,3200}
		};
		
		
		
		int[][] courses1 ={{7,17},
						   {3,12},
						   {10,20},
						   {9,10},
						   {5,20},
						   {10,19},
						   {4,18}};
		
		
		
		
		int[][] courses2 ={{7,16},{2,3},{3,12},{3,14},{10,19},{10,16},{6,8},{6,11},{3,13},{6,16}
};
		
		
		
		int[][] course3={{591,2987},{905,974},{267,6878},
				{429,6721},{137,8097},{888,2239},{787,6628},{40,4439},
				{173,7560},{726,3298},{453,6884},{490,2146},{822,9678},
				{929,9673},{304,2212},{669,2829},{437,4696}};

		//Let's print the contents of priority queue:
		
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        

        
        
        
        
        
		
		System.out.println(scheduleCourse(course3));
	}
	
	public  static int scheduleCourse(int[][] courses) {
        
		//sort this in basis of time
	//200, 1250, 1300, 3200	
		
		Arrays.sort(courses, (a,b)->Integer.compare(a[1], b[1]));
		
		
		//print the array to check if this is  correctly sorted
		
		//Arrays.asList(courses).stream().map(Arrays::toString).
		//forEach(System.out::println);
		
		//create a new array
		
		int[] tempArray = new int[courses.length];		
		int countArray[] = new int[courses.length];
 		
		for(int i=0;i<tempArray.length;i++) {
			tempArray[i] = courses[i][0];
			countArray[i] =1; //initialize all the counts with 1
		}
		
  //Now that the array is sorted, apply the below logic
		
   //iterate through all the courses
		
		for(int i=1;i<courses.length;i++) {
			for(int k=0;k<i;k++) {
				int tempVal = courses[i][0]+tempArray[k];//adding the days
				
		if(tempVal>courses[i][1]) {
					//check it against the total days allocated, not feasible to use it.
					
					if(courses[i][0] + courses[k][0]<=courses[i][1] && countArray[i]<=2 ) {
						tempArray[i] = courses[i][0] + courses[k][0];
						countArray[i] = 2;
					}
					else {
					tempArray[i] = tempArray[i];
					}
					
				
				
		} else if(countArray[k]+1>countArray[i]){ 
					
				countArray[i] = countArray[k]+1;
				tempArray[i] = tempVal;
				}
				
				else {
					tempArray[i] =Math.min(tempVal, tempArray[i]);}
				}
			
		}
	
		
		 Arrays.sort(countArray);

		
		
    return countArray[countArray.length-1];}

}
