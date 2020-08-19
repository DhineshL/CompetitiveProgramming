package com.company.Level3;

import java.util.Scanner;

public class FlippingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] gain = new int[n];
        int ans=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if (arr[i]==1) {
                gain[i] = -1;
                ans++;
            }
            else gain[i]=1;
        }
        int sum =gain[0];
        int var = sum;
        for (int i = 1; i <n; i++) {
            var = Math.max(gain[i],var+gain[i]);
            if (sum<var)
                sum=var;
        }

        System.out.println(sum+ans);
    }
}
