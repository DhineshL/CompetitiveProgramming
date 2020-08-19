package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisors {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int [] count = new int [8];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            count[num]++;
        }
        if (count[1]!=n/3||count[7]>0||count[5]>0||count[2]<count[4]||count[3]>count[6]||count[2]+count[3]!=count[4]+count[6])
            System.out.println(-1);
        else {
            for (int i = 0; i < count[4]; i++) {
                System.out.println("1 2 4");
            }
            for (int i = 0; i < count[2]-count[4]; i++) {
                System.out.println("1 2 6");
            }
            for (int i = 0; i < count[3]; i++) {
                System.out.println("1 3 6");
            }
        }
    }
}
