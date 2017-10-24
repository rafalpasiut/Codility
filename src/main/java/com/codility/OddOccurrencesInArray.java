package com.codility;
import java.util.*;

public class OddOccurrencesInArray {
    public int solution(int[] A) {

        if(A.length == 1) {
            return A[0];
        }
        Arrays.sort(A);
        int number = 1;

        for(int i=1; i<A.length;i++){
            if(A[i-1] == A[i]){
                number++;
            } else if (number % 2 == 0) {
                number = 1;
            } else {
                return A[i - 1];
            }
        }

        return A[A.length-1];
    }
}
