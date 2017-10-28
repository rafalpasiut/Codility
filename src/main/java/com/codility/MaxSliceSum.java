package com.codility;
// we DO NOT assume that there can be empty slice with 0 value, so if new Slice is less than previous one we init with A[i] instead of 0

public class MaxSliceSum {
    public int solution(int[] A) {
        int sliceSum=0, maxSlice=A[0];

        for(int a:A){
            sliceSum = Math.max(sliceSum+a,a);
            maxSlice = Math.max(maxSlice,sliceSum);
        }
        return maxSlice;
    }
}
