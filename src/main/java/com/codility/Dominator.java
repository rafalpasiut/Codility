package com.codility;
import java.util.*;

public class Dominator {
    public int solution(int[] A) {
        Stack<Integer> dominatorStack = new Stack<Integer>();
        int dominator, dominatorCount=0, dominatorIndex=0;

        for(int a: A){
            if(dominatorStack.empty()){
                dominatorStack.push(a);
            }else if(dominatorStack.peek()!=a){
                dominatorStack.pop();
            }else{
                dominatorStack.push(a);
            }
        }
        if(dominatorStack.empty()){
            return -1;
        }
        dominator = dominatorStack.pop();
        int i=0;
        for(int a:A){
            if(dominator==a){
                dominatorCount++;
                dominatorIndex=i;
            }
            i++;
        }
        if(dominatorCount>(double)A.length/2){
            return dominatorIndex;
        }else{
            return -1;
        }
    }
}
