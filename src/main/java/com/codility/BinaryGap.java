package com.codility;

public class BinaryGap {
    public int solution(int N) {

        int maxLength = 0;
        int tmpMaxLength = 0;
        boolean startCheck = false;

        while(N>0)
        {
            if(startCheck){
                if(N%2==0){
                    tmpMaxLength++;
                } else {
                    maxLength = tmpMaxLength>maxLength ? tmpMaxLength : maxLength;
                    tmpMaxLength = 0;
                }
            }
            else{
                startCheck = N%2 !=0;
            }
            N = N/2;
        }
        return maxLength;
    }
    public static void main(String[] args){

        BinaryGap binaryGapCounter = new BinaryGap();
        System.out.println(binaryGapCounter.solution(17));
    }
}
