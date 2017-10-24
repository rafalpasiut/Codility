package com.codility;

public class ArrayShift {
    public int[] solution(int[] A, int K) {

        int length = A.length;
        if(length!=0){
            int lastElement;
            for(int i=0; i<K; i++){
                lastElement = A[A.length-1];
                for(int j=A.length-2; j>=0 ; j--){
                    A[j+1]=A[j];
                }
                A[0] = lastElement;
            }
        }
        return A;
    }
}
