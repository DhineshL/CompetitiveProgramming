package com.company.Review;

import java.util.Scanner;

public class CutRibbonDp {
    public static int [] dp;
    public static  int a,b,c;
    public static int func(int n){
        if (n==0) return 0;
        if (n<0) return Integer.MIN_VALUE;
        if (dp[n]==0) dp[n]=Math.max(Math.max(func(n-a),func(n-b)),func(n-c))+1;
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = sc.nextInt();
        b= sc.nextInt();
        c = sc.nextInt();
        dp=new int[n+1];
        System.out.println(func(n));
    }
}
