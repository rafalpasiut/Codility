package com.codility;

import java.util.Stack;

public class Brackets {
    public int solution(String S) {
        if(S.length()==0){
            return 1;
        }
        char popped;
        char sign;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<S.length();i++){
            sign = S.charAt(i);
            if(sign=='[' || sign=='(' || sign=='{'){
                stack.push(sign);
            } else {
                if(stack.empty()){
                    return 0;
                } else{
                    popped = stack.pop();
                    if((sign==']' && popped=='[') || (sign=='}' && popped=='{') || (sign==')' && popped=='(')){
                        continue;
                    } else {
                        return 0;
                    }
                }
            }
        }
        if(stack.size()>0){
            return 0;
        }
        return 1;
    }
}
