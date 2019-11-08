package com.ani.codesignal;

import java.util.HashMap;
import java.util.Map;


/*

 The idea is to support custom functions on HashMap



 */
public class HashMapCustom {


    long hashMap(String[] queryType, int[][] query) {

        long result=0L;
        Map<Integer,Integer> tempMap = new HashMap<>();
        for(int i=0;i<queryType.length;i++){
            String queryName = queryType[i];
            int[] val = query[i];

            if(queryName.equalsIgnoreCase("insert")){
                tempMap.put(val[0],val[1]);
                System.out.println("In the insert function: key:"+ val[0] + "value is: " +tempMap.get(val[0]));
            } else if(queryName.equalsIgnoreCase("addToValue")){
                //fetch all the values from the map and then add the number and put them back in the map
                for(int key:tempMap.keySet()){
                    tempMap.put(key,tempMap.get(key)+val[0]);
                }
            } else if(queryName.equalsIgnoreCase("addToKey")){
                for(Map.Entry<Integer,Integer> entry:tempMap.entrySet()){
                    int key=entry.getKey()+val[0];
                    int value=entry.getValue();
                    tempMap.put(key,value);
                }
            } else {
                System.out.println(tempMap.get(val[0]));
                result = Long.valueOf(tempMap.get(val[0]));
            }//for get
        }
        return result;
    }

}
