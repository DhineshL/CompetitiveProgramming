package com.company.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DimaAndContinuousLine {
    public static void main(String[] args) throws IOException   {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int a,b,c,d;
        for (int i = 0; i < n-1; i++) {
            b = Math.max(arr[i],arr[i+1]);
            a = Math.min(arr[i],arr[i+1]);
            for (int j = 0; j < n-1; j++) {
                d = Math.max(arr[j],arr[j+1]);
                c = Math.min(arr[j],arr[j+1]);
                if ((a<c&&c<b&&b<d)||(c<a&&a<d&&d<b)){
                    System.out.print("yes");
                    return;
                }
            }
        }
        System.out.print("no");
    }
}
