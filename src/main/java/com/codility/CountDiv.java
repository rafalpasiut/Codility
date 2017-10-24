package com.codility;

public class CountDiv {
    public int solution(int A, int B, int K) {

        int divs=0;
        int i;

        for(i=A;i<=B;i++){
            if(i%K==0){
                divs = (B-i)/K;
                if(i!=B || A==B){
                    divs++;
                }
                break;
            }
        }
        return divs;
    }
}
