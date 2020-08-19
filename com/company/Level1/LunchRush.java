package com.company.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LunchRush {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int no_r = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max_joy=0;
        for (int i = 0; i < no_r; i++) {
            st = new StringTokenizer(bf.readLine());
            int f = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int cur_joy = t<=k?f:f-(t-k);
            if (i!=0){
                if (max_joy<cur_joy)
                    max_joy = cur_joy;
            }
            else {
                max_joy =cur_joy;
            }
        }
        System.out.println(max_joy);

    }
}
