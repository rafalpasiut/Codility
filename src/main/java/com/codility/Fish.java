package com.codility;

import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<Integer>();

        int alive=0;
        int fish;

        for(int i=0;i<A.length;i++){
            if(B[i]==1){
                stack.push(A[i]);
            }else{
                if(stack.size()==0){
                    alive++;
                }else{
                    while(true){
                        fish = stack.peek();
                        if(fish<A[i]){
                            stack.pop();
                            if(stack.size()==0){
                                alive++;
                                break;
                            }
                        }else{
                            break;
                        }
                    }
                }
            }
        }
        alive=alive+stack.size();
        return alive;
    }
}
