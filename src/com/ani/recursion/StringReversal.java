package com.ani.recursion;

public class StringReversal {

    public static void main(String[] args){

        String sample = "hello";

        StringBuffer buf = new StringBuffer();
        int index =0;

        reversal(sample,buf,index);
        System.out.println(buf.toString());
    }


    private  static void reversal(String sample,StringBuffer buf,int index) {

        if(sample.length()==index){ //hello
            return;
        }

        char c = sample.charAt(index);
        reversal(sample,buf,index+1);
        buf.append(c);
    }


    /*
    The logic is pretty simple

    Sample String - ABC
    When you need to reverse :

    subString(0,ABC)+


     */
    private static void reversalWithoutIndex(String sample){


    }
}
