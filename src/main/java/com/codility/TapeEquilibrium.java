package com.codility;
import static java.lang.Math.abs;

public class TapeEquilibrium {
    public int solution(int[] A) {

        int sumRight = 0;
        int sumLeft = 0;
        int ans;

        for (int i =1;i<A.length;i++){
            sumRight += A[i];
        }

        sumLeft = A[0];
        ans = abs(sumRight-sumLeft);

        for (int P=1; P<A.length; P++)
        {
            if (abs(sumLeft - sumRight)<ans){
                ans = abs(sumLeft - sumRight);
            }
            sumLeft += A[P];
            sumRight -=A[P];
        }
        return (int) ans;
    }
}
