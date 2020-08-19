package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Kuriyama {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long [] arr = new long[n+1];
        long [] prefix_sum = new long[n];
        for (int i = 1; i < n+1; i++) {
            arr[i] =Long.parseLong(st.nextToken());
        }
//        long [] a1 = Arrays.copyOf(arr);
        Arrays.parallelSort(arr);

        int ques = Integer.parseInt(bf.readLine());
        for (int i = 0; i < ques; i++) {
            st = new StringTokenizer(bf.readLine());
            int type = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            if (type==1){
                if (l==1)
                    System.out.println(prefix_sum[r-1]);
                else
                    System.out.println(prefix_sum[r-1]-prefix_sum[l-2]);
            }
            else
                System.out.println(arr[r]-arr[l-1]);
        }
    }
    public static long [] cumulativeSum(long [] arr){
        long s [] = new long[arr.length+1];
        for (int i = 1; i <arr.length+1; i++) {
            s[i] = arr[i-1] +s[i-1];
        }
        return s;
    }
}
