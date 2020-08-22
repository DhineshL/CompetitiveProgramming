package com.company.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CielAndFlowers {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int ans=0,temp=0;
        for (int i = 0; i < 3; i++) {
            if (a-i<0||b-i<0||c-i<0) continue;
            temp = i + (a-i)/3+(b-i)/3+(c-i)/3;
            if (temp>ans){
                ans=temp;
            }
        }
        System.out.print(ans);
    }
}
