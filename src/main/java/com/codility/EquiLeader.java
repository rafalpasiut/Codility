package com.codility;
import java.util.*;

public class EquiLeader {


// If x is leader of A, and we wsplit table so: A[0]...A[i] and A[i+1]..A[n], that they have the same leader y.
// So y has to exist more than i/2 AND more than (n-i)/2, so for the whole array more than i/2 + (n-i)/2 = more than n/2, so x=y

    public int solution(int[] A) {

        Stack<Integer> leaderStack = new Stack<Integer>();
        int leader;
        int leaderCount=0;
        int currentLeaderCount=0, equiLeader=0;

        for(int i=0;i<A.length;i++){
            if(leaderStack.empty()){
                leaderStack.push(A[i]);
            }else{
                if(A[i]!=leaderStack.peek()){
                    leaderStack.pop();
                }else{
                    leaderStack.push(A[i]);
                }
            }
        }
        if(leaderStack.empty()){
            return 0;
        }else{
            leader = leaderStack.pop();
        }
        for(int a:A){
            if(leader==a){
                leaderCount++;
            }
        }
        if(!(leaderCount>(double)A.length/2)){
            return 0;
        }
        for(int i=0;i<A.length-1;i++){
            if(A[i]==leader){
                currentLeaderCount++;
            }
            if(currentLeaderCount>(double)(i+1)/2 && ((leaderCount-currentLeaderCount)>(double)(A.length-i-1)/2)){
                equiLeader++;
            }
        }
        return equiLeader;
    }
}
