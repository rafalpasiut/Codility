package com.codility;

public class MaxProfit {
    public int solution(int[] A) {

        if(A.length<2){
            return 0;
        }
        int profit = 0, maxProfit=0;
        int startCash=A[0];

        for(int i=1;i<A.length;i++){
            if((A[i]-startCash)<0){
                startCash=A[i];
            }else{
                profit = A[i]-startCash;
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}
