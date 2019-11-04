package com.ani.recursion;

public class SumofNaturalNumbers {

    public static void main(String[] args) {

        int n=0;
        int res=0;
        System.out.println(sum(n));

    }


    static int sum(int n){
        if(n==100){
            return n;
        }
        return n + sum(n+1);

    }

}
