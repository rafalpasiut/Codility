package com.codility;

import java.util.Stack;

public class StoneWall {
    public int solution(int[] H) {
        Stack<Integer> stack = new Stack<Integer>();
        int block =0;

        for(int i=0;i<H.length;i++){
            while(stack.size()!=0 && H[i] < stack.peek()){
                stack.pop();
                block++;
            }
            if(stack.size()==0 || stack.peek()<H[i]){
                stack.push(H[i]);
            }
        }
        return block+stack.size();
    }
}
