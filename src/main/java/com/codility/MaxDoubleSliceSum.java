package com.codility;

public class MaxDoubleSliceSum {
    public int solution(int[] A) {
        int[] leftSums = new int[A.length];
        int[] rightSums = new int[A.length];
        int max=0;

        for(int i=1;i<A.length-1;i++){
            leftSums[i]=Math.max(leftSums[i-1]+A[i],0);
        }
        for(int i=A.length-2;i>0;i--){
            rightSums[i]=Math.max(rightSums[i+1]+A[i],0);
        }
        for(int i=1;i<A.length-1;i++){
            max = Math.max(max,leftSums[i-1]+rightSums[i+1]);
        }
        return max;
    }
}
