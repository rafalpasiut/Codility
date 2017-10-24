package com.codility;

import java.util.Arrays;

public class Triangle {
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(int[] A) {

            if(A.length<3){
                return 0;
            }
            Arrays.sort(A);
            for(int i=0;i<A.length-2;i++){
                if((long)A[i]+(long)A[i+1]>(long)A[i+2] && A[i]>0){
                    return 1;
                }
            }
            return 0;
        }
    }
}
