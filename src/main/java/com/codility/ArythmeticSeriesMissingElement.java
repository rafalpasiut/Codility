package com.codility;
import java.util.Arrays;

public class ArythmeticSeriesMissingElement {
    public int solution(int[] A) {

        int i;
        int j=1;
        if(A.length ==0){
            return 1;
        } else {
            Arrays.sort(A);
            for(i=0;i<A.length;i++){
                if(A[i]!=j){
                    return j;
                }
                j++;
            }
        }
        return j;
    }
}
