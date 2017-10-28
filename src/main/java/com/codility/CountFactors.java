package com.codility;

public class CountFactors {

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    public int solution(int N) {

        int factors=0;

        int i=1;
        while((long)i*i<N){
            if(N%i==0){
                factors+=2;
            }
            i++;
        }
        if((long)i*i==N){
            factors++;
        }
        return factors;
    }

}
