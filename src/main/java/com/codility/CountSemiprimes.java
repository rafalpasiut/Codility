package com.codility;

import java.util.Arrays;

public class CountSemiprimes {

    boolean[] prime, semiPrime;

    public void sieve(int n) {
        prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<=n;j+=i){
                prime[j]=false;
            }
        }
    }

    public void semi(int n) {
        semiPrime = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                continue;
            }else{
                for(int j=i*i;j<=n;j+=i){
                    if(prime[j/i]){
                        semiPrime[j] = true;
                    }
                }
            }
        }
    }

    public int[] solution(int N, int[] P, int[] Q) {
        sieve(N);
        semi(N);
        int[] sum = new int[N+1];
        int[] result = new int[P.length];
        for(int i=2; i<=N;i++){
            sum[i] = sum [i-1];
            if(semiPrime[i]){
                sum[i]++;
            }
        }
        for(int i=0;i<P.length;i++){
            result[i]=sum[Q[i]]-sum[P[i]];
            if(semiPrime[P[i]]){
                result[i]++;
            }
        }
        return result;
    }

    public static void main(String[] arg){
        int n=26;
        int[] p = {1,4,16};
        int[] q = {26,10,20};

        CountSemiprimes semiCount = new CountSemiprimes();

        int[] semi = semiCount.solution(n,p,q);

        for(int i: semi){
            System.out.print(i+";");
        }
    }
}
