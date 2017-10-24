package com.codility;

public class MaxCounters {
    public int[] solution(int N, int[] A) {

        int[] result = new int[N];
        boolean[] maxAdded = new boolean[N];
        int max = 0;
        int lastMax = 0;
        int sumToAdd =0;
        int currentValue;
        boolean setMax=false;
        for(int i=0; i<A.length; i++){
            currentValue = A[i];
            if(currentValue>N){
                maxAdded = new boolean[N];
                setMax = true;
                lastMax = max;
            } else {
                if(!maxAdded[currentValue-1] && setMax){
                    maxAdded[currentValue-1] = true;
                    result[currentValue-1] = lastMax;
                }
                result[currentValue-1]++;
                if((result[currentValue-1])>max){
                    max=result[currentValue-1];
                }
            }
        }
        for(int i=0;i<N;i++){
            if(!maxAdded[i]&&setMax){
                result[i]=lastMax;
            }
        }
        return result;
    }
}
