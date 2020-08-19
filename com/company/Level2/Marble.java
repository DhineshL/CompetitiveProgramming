package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Marble {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken())+1;
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int arr [] = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        int index=s;
        for (int i = 0; i < n; i++) {
            if (index==t){
                System.out.println(i);
                break;
            }
           index=arr[index];
        }
        if (index!=t)
            System.out.println(-1);
    }
}
