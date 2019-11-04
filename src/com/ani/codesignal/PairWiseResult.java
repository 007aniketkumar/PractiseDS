package com.ani.codesignal;

import java.util.Arrays;
import java.util.Collections;

public class PairWiseResult {

    public static void main(String[] args){

        Integer input[] = {1,1,2,2,3,3};

        int k=2;
       int counterResult= solve(input,k);
        System.out.println("counterResult"+ counterResult);
    }

    private static int solve(Integer input[],int k){
        int counterResult=0;
        Arrays.sort(input, Collections.reverseOrder());

        //have one more array to have a visited/unvisted flag at each position.

        boolean []arrayFlag=new boolean[input.length];
        //mark every position as visited.
        for(int l=0;l<arrayFlag.length;l++){
            arrayFlag[l] =true;
        }

        for(int i=0;i<input.length-1;i++){
            for(int j=i+1;j<input.length;j++)
            if(input[i]-input[j]==k && arrayFlag[j]){
                counterResult++;
                arrayFlag[j]=false;
            }
        }
return counterResult;

    }

}
