package com.ani.codesignal;


/*
The idea is given an array:
    Add the numbers in this format :

[10,2]

final result :
    a[0].a[0] = 1010
    a[0].a[1] = 102
    a[1].a[0] =  210
    a[1].a[1] = 22

    add all the above and return the result.



 */

import java.util.Arrays;

public class concatenationsum {

    public static void main(String[] args){
      int [] a= new int[]{10,2};
      System.out.println(computeSum(a));
    }






    static long computeSum(int a[]){

        Long res[] = new Long[a.length*2];
        int count=0;//to iterate over the result array
        long sum =0L;
     for(int i=0;i<a.length;i++){
        for(int k=0;k<a.length;k++){
            res[count++] = Long.valueOf(String.valueOf(a[i]).concat((String.valueOf(a[k]))));

        }


     }

     Arrays.stream(res).forEach(System.out::println);

     for(long val:res) {
         sum = sum+val;
     }


    return sum;



    }

}
