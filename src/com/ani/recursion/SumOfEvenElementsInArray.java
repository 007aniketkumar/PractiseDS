package com.ani.recursion;

public class SumOfEvenElementsInArray {

    public static void main(String[] args){

        int inputArray[] = {1,2,3,4,5};

        System.out.println(sum(inputArray,0));

    }


    private static int sum(int []inputArray,int n) {
        if(n==inputArray.length) {
            return 0;
        }

        if(inputArray[n]%2==0){
           return inputArray[n] + sum(inputArray,n+1);
        }
        else {
            return sum(inputArray,n+1);
        }
    }
}
