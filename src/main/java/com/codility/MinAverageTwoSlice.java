package com.codility;

public class MinAverageTwoSlice {
    public int solution(int[] A) {

        double minMean = 100000;
        int minSliceStartIndex=0;
        double mean1;
        double mean2;

        for(int i=0; i<A.length-2; i++){
            mean1 = (double)(A[i]+A[i+1])/2;
            mean2 = (double)(A[i]+A[i+1]+A[i+2])/3;
            if(mean1<minMean){
                minMean = mean1;
                minSliceStartIndex = i;
            }
            if(mean2<minMean){
                minMean = mean2;
                minSliceStartIndex = i;
            }
        }
        mean1 = (A[A.length-2]+A[A.length-1])/2;
        if(mean1<minMean){
            minSliceStartIndex = A.length-2;
        }
        return minSliceStartIndex;
    }
}
