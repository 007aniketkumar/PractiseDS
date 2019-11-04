package com.ani.stack;

import java.util.Stack;


//Program to find the max in a stack without using any additional stack
public class FindMaxInStack {



    public static void main(String[] args){
        Stack<Integer> stk = new Stack<>();

        stk.push(10);
        stk.push(4);
        stk.push(6);
        stk.push(92);

        System.out.println(maxElement(stk,Integer.MIN_VALUE));

    }


    private static int maxElement(Stack<Integer> inputStack, int max) {

        if(inputStack.isEmpty()) { //if input stack is empty return max
            return max;
        }

        max = Math.max(inputStack.pop(),max);
        return  maxElement(inputStack,max);


    }
}
