package com.company.Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ktrees {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        long dp [] = new long[n+1];
        long dp2 [] = new long[n+1];
        int mod = (int) (1e9+7);
        dp[0]=1;
        dp2[0]=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=k; j++) {
                if (i-j>=0){
                    dp[i]=(dp[i]+dp[i-j])%mod;
                }
                else break;
            }
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <d; j++) {
                if (i-j>=0){
                    dp2[i]=(dp2[i]+dp2[i-j])%mod;
                }
                else break;
            }
        }
        System.out.print(((dp[n]-dp2[n])%mod+mod)%mod);
    }
}