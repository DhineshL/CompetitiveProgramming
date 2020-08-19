package com.company.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DimaAndStaircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int [] stair = new int[n+1];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 1; i <n+1; i++) {
            stair[i]=Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(bf.readLine());
        long prev=1,h_=0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            long ans = Math.max(prev+h_,stair[w]);
            System.out.println(ans);
            prev=ans;
            h_=h;
        }

    }
}
