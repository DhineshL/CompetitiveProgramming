package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sale {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int size = Integer.parseInt(st.nextToken());
        int strength = Integer.parseInt(st.nextToken());
        int max = 0;
        int [] tv_price = new int[size];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < size; i++) {
            tv_price[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tv_price);
        for (int i = 0; i < strength; i++) {
            if (tv_price[i]>0)
                break;
            max+= tv_price[i];
        }
        System.out.println(-max);
    }
}

