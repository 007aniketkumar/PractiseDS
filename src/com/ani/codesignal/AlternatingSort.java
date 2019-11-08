package com.ani.codesignal;


import java.util.Arrays;

/*


The idea is :
given an array : 1,3,6,5,4

create a new array in such a way that:

 res[0]=a[0]
 res[1]= last element of a
 res[2]=a[1]
 res[3]= second last element of a
 res[4]=a[2]
 res[5]= third last element of a


 res[] = 1,4,3,5,6




 */
public class AlternatingSort {


    public static void main(String[] args){

        int []a = new int[]{1,4,6,5,3};

        System.out.println(alternatingsort(a));


    }


    static boolean alternatingsort(int []a){

        int res[] = new int[a.length];
        int count=0;
        for(int i=0;i<a.length;i++){

            if(i%2==0){//if even
                res[i]= i==0?a[0]:a[i/2];
            } else {
                res[i] = a[(a.length-(++count))];
            }
        }

        Arrays.stream(res).forEach(System.out::println);

        for(int l=0;l<res.length-1;l++){

          if(res[l]>res[l+1])
              return false;
        }
    return true;}


}
