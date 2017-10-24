package com.codility;

import java.util.Stack;

public class Nesting {
    public int solution(String S) {
        if(S.length()==0){
            return 1;
        }

        char sign;
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<S.length();i++){
            sign = S.charAt(i);
            if(sign=='('){
                stack.push('(');
            } else{
                if(stack.size()==0){
                    return 0;
                }
                if(stack.pop()!='('){
                    return 0;
                }
            }
        }
        if(stack.size()>0){
            return 0;
        }else{
            return 1;
        }
    }
}
