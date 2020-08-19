package com.company.Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GeorgeAndJob {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long [] arr = new long[n+1];
        st = new StringTokenizer(bf.readLine());
        for (int i = 1; i < n+1; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        long[] prefix_sum = new long[n+1];
        for (int i = 1; i <=n; i++) {
           prefix_sum[i] =prefix_sum[i-1]+arr[i];
        }
        long [][] dp = new long[n+1][k+1];
        for (int i = 1; i < n+1; i++) {
            for (int l = 1; l < k+1; l++) {
                dp[i][l]=dp[i-1][l];
                if (i>=m)
                    dp[i][l]=Math.max(prefix_sum[i]-prefix_sum[i-m]+dp[i-m][l-1],dp[i-1][l]);
            }
        }
        System.out.print(dp[n][k]);

    }
}
