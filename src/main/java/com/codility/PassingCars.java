package com.codility;

public class PassingCars {
    public int solution(int[] A) {

        int sum=0;
        long total=0;
        int i;

        for(i=A.length-1;i>=0;i--){
            if(A[i]==1){
                sum++;
            } else {
                total=total+sum;
            }
        }
        if(total>1000000000){
            return -1;
        } else {
            return (int)total;
        }
    }
}
