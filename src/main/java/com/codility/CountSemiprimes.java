package com.codility;

public class CountSemiprimes {

    boolean[] notPrime, semi;
    public void seivee(int n) {
        for (int i=2; i * i<=n; i++) {
            if (notPrime[i]) continue;
            for (int k=i*i; k<=n; k+=i) {
                notPrime[k] = true;
            }
        }
    }

    public void semi(int n) {
        for (int i=2; i*i<=n; i++) {
            if (notPrime[i]) continue;
            for (int k=i*i; k<=n; k+=i) {
                if (!notPrime[k/i]) semi[k] = true;
            }
        }
    }

    public int[] solution(int N, int[] P, int[] Q) {
        notPrime = new boolean[N+1];
        seivee(N);
        semi = new boolean[N+1];
        semi(N);
        int[] sum = new int[N+1];
        for (int i=1; i<=N; i++) {
            sum[i] = sum[i-1];
            if (semi[i]) sum[i]++;
        }
        for (int i=0; i<P.length; i++) {
            P[i] = sum[Q[i]] - sum[P[i] - 1];
        }
        return P;
    }
}
