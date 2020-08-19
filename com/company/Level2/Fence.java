package com.company.Level2;

import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i]=sc.nextInt();
        }
        int sum =0;
        for (int i = 0; i < k; i++) {
            sum+=height[i];
        }
        int index=0;
        int min=sum;
        int j=0;
        for (int i = k; i < n; i++) {
            sum+=height[i];
            sum-=height[j++];
            if (sum<min){
                index = j;
                sum=min;
            }
        }
        System.out.println(index+1);
    }
}
