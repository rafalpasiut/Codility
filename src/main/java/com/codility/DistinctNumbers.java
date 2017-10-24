package com.codility;

import java.util.Arrays;

public class DistinctNumbers {
    public int solution(int[] A) {

        Arrays.sort(A);

        if(A.length==0){
            return 0;
        }

        int count=1;

        int lastNotDistinct = Integer.MAX_VALUE;

        for(int i=1; i<A.length;i++){
            if(A[i]!=A[i-1] && A[i]!=lastNotDistinct){
                lastNotDistinct = A[i];
                count++;
            }
        }

        return count;
    }
}
