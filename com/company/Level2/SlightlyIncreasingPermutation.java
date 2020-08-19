package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SlightlyIncreasingPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int j=0;
        for (int i = 1; i <=n; i++) {
            if (i>n-k-1)
                System.out.print(n-j++ +" ");
            else
                System.out.print(i+" ");
        }
    }
}
