package com.sarvan.learn.k8s.to;

import java.util.*;

public class DiagonalTraversal {

        public int[] findDiagonalOrder(int[][] mat) {

            if(mat==null || mat.length==0) return new int[0];
            int row= mat.length;
            int col=mat[0].length;
            int result[]= new int [row*col];
            Map<Integer, List<Integer>> mapVal=new HashMap<>();
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    int key=i+j;
                    if(!mapVal.containsKey(key)){
                        mapVal.put(key,new ArrayList<>());
                    }
                    mapVal.get(key).add(mat[i][j]);
                }
            }
            int count=0;
            for (Map.Entry<Integer, List<Integer>> entry : mapVal.entrySet()) {
                List<Integer> tempList= new ArrayList<>();
                if(entry.getKey()%2==0){
                    tempList=entry.getValue();
                    Collections.reverse(tempList);
                }
                else{
                    tempList=entry.getValue();
                }
                for (int i=0;i<tempList.size();i++){
                    result[count++]=tempList.get(i);
                }
            }
            return result;
        }
}
