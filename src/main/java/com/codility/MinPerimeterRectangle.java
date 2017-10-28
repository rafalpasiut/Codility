package com.codility;

public class MinPerimeterRectangle {
    public int solution(int N) {

        int minPerimeter=Integer.MAX_VALUE, i=1;

        while(i*i<=N){
            if(N%i==0){
                minPerimeter = Math.min(minPerimeter, (2*i+2*(N/i)));
            }
            i++;
        }
        return minPerimeter;
    }
}
