package com.codility;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public int serach(int[] array, long target, int start){ // znajdz ostatni <= target
        int high,mid;
        high = array.length;
        while(true){
            mid=(high+start)/2;
            //System.out.println(start + "xx" + high + "xx" + mid);
            if((array[mid]<=target && mid == array.length-1) || (array[mid]<=target && array[mid+1]>target)){
                //System.out.println(mid);
                return mid;
            } else if(array[mid]<=target){
                start=mid;
            } else{
                high=mid;
            }
        }
    }
    public int solution(int[] A) {

        int[] ranges = new int[A.length];
        long sum=0;
        int target;
        for(int i=0;i<A.length;i++){
            ranges[i]=i-A[i];
        }
        Arrays.sort(ranges);
        for(int i=0;i<A.length-1;i++){
            sum= sum+serach(ranges,i+(long)A[i],i);
            sum=sum-i;
            if(sum>10000000){
                return -1;
            }
        }
        return (int)sum;
    }
}
