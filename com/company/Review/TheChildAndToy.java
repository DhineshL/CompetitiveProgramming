package com.company.Review;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheChildAndToy {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] weights = new int[n+1];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i <n; i++) {
            weights[i+1]=Integer.parseInt(st.nextToken());
        }
        int min_sum =0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            min_sum +=Math.min(weights[a],weights[b]);

        }
        System.out.println(min_sum);
    }
}
