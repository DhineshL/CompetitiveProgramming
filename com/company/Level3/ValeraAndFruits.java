package com.company.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValeraAndFruits {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int last_day = 1;
        int [] days = new int[3002];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            int day = Integer.parseInt(st.nextToken());
            int fruits = Integer.parseInt(st.nextToken());
            days[day]=fruits;
            if (day>last_day) last_day=day;
        }
        int fruits_collected =0;
        int vi;
        for (int i = 1; i <=last_day+1; i++) {
            vi =v;
            fruits_collected += Math.min(vi,days[i-1]);
            vi -= Math.min(vi,days[i-1]);
            fruits_collected += Math.min(vi,days[i]);
            days[i] -= Math.min(vi,days[i]);
        }
        System.out.print(fruits_collected);
    }
}