package com.codility;

public class MaxDoubleSliceSum {
    public int solution(int[] A) {
        int[] leftSums = new int[A.length];
        int[] rightSums = new int[A.length];
        int max=0, j=A.length-2;

        for(int i=1;i<A.length-1;i++){
            leftSums[i]=Math.max(leftSums[i-1]+A[i],0);
            rightSums[j]=Math.max(rightSums[j+1]+A[j],0);
            j--;
        }
        for(int i=1;i<A.length-1;i++){
            max = Math.max(max,leftSums[i-1]+rightSums[i+1]);
        }
        return max;
    }
}
