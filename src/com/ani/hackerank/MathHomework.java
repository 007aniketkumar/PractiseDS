package com.ani.hackerank;


//[1,3,4,7]

//threshold =4
//jumps=4

import java.util.LinkedList;
import java.util.List;

public class MathHomework {


    static int jumps(List<Integer> points,int threshold){

        int min= points.get(0);
        int max = points.get(points.size()-1);
        int jumps =1;

        if(max-min<threshold){
            //read everything
            return points.size();
        }

        //check if the min itself is greater than threshold

        if(min>=threshold){
            return 1;
        }

        for(int i=1;i<points.size();i++){
            jumps =jumps+1;

            if(threshold==points.get(i)-min){
                return jumps;
            } else if((threshold>points.get(i)-min) && ((i+1) < points.size() && threshold > points.get(i+1)-min)){

                    i=i+1;
                    continue;
                } else{
                    return jumps;
                }
            }



        return jumps;









    }



    public static void main(String[] args){
        List<Integer> points = new LinkedList<>();
        points.add(1);
        points.add(3);
        points.add(4);
        points.add(7);

        int threshold =4;

        System.out.println(jumps(points,threshold));

    }
}
