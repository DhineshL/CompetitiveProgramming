package com.company.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetrAndCombinationLock {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int [] degree = new int[n];
        for (int i = 0; i < n; i++) {
            degree[i]=Integer.parseInt(bf.readLine());
        }
        for (int mask = 1; mask < (1<<n); mask++) {
            int sum=0;
            for (int i = 0; i < n; i++) {
                if ((mask&(1<<i))!=0){
                    sum+=degree[i];
                }
                else
                    sum-=degree[i];
            }
            if (sum%360==0) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}
