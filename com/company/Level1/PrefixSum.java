package com.company.Level1;

import java.util.Scanner;

public class PrefixSum {
    public static long numberOfWays(int [] arr){
        for (int i = 1; i <arr.length ; i++) {
            arr[i]+=arr[i-1];
        }
        long count_S=0;
        long count_2S =0;
        long sum = arr[arr.length-1]/3;
        for (int i = 0; i <arr.length-1; i++) {
            if(arr[i]==2*sum) count_2S+=count_S;
            if(arr[i]==sum) count_S++;

        }
        return count_2S;
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
