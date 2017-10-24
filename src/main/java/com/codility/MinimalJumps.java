package com.codility;
import java.util.*;

//Frog jump
public class MinimalJumps {
    public int solution(int X, int Y, int D) {

        int jumpsNo;
        double distance=Y-X;

        jumpsNo = (int)Math.ceil(distance/D);

        return jumpsNo;
    }
}
