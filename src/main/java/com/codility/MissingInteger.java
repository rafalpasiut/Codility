package com.codility;

import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] A) {

        Arrays.sort(A);

        int min=1;

        for(int a :A){
            if(a==min){
                min++;
            }
        }
        return min;
    }
}
