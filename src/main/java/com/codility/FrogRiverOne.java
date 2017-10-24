package com.codility;

public class FrogRiverOne {
    public int solution(int X, int[] A) {

        int[] path = new int[X];
        int roadSum = 0;

        for(int i=0; i<A.length;i++){
            if(path[A[i]-1]!=1){
                roadSum++;
                path[A[i]-1] = 1;
                if(roadSum>=X){
                    return i;
                }
            }
        }
        return -1;
    }
}
