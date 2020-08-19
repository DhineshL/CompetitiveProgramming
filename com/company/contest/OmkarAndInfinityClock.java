package com.company.contest;

import com.company.Level2.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class OmkarAndInfinityClock {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(bf.readLine());
        for (int i = 0; i < test; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long max = 0;
            long [][] arr = new long[n][2];
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j <n; j++) {
                arr[j][0]= Long.parseLong(st.nextToken());
                arr[j][1]=j;
            }
            Arrays.sort(arr, Comparator.comparingLong(x->x[0]));
            max=arr[n-1][0];
            for (int l = 0; l< k; l++) {
                for (int j = 0; j < n; j++) {
                    arr[j][0]= max-arr[j][0];
                }
                max=l%2==0?arr[0][0]:arr[n-1][0];
            }
            Arrays.sort(arr,Comparator.comparingLong(x->x[1]));
            System.out.print(arr[0][0]);
            for (int j = 1; j <n ; j++) {
                System.out.print(" "+arr[j][0]);
            }
            System.out.println("");
        }
    }
}
