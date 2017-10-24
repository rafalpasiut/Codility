package com.codility;
import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {

        Arrays.sort(A);

        int i=1;

        for(int x : A){
            if(x!=i){
                return 0;
            }
            i++;
        }
        return 1;
    }
}
