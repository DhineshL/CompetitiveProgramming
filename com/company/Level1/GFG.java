package com.company.Level1;

import java.util.Arrays;
import java.util.Scanner;

public class GFG {
    public static long numberOfWays(int [] arr){

        long ans = 0;
        long count_S =0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if(sum%3!=0)
            return 0;
        sum /= 3;
        long seg_sum =0;
        for (int i = 0; i <=arr.length-2; i++) {
            seg_sum += arr[i];
            if(seg_sum==2*sum) ans += count_S;
            if(seg_sum==sum) count_S++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(numberOfWays(arr));
    }
}
