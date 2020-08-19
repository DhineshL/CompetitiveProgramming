package com.company.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SerejaAndBottles {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());

        }
        int ok=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i]==b[j]&&i!=j){
                    {
                        ok++;
                        break;
                    }
                }
            }
        }
        System.out.print(n-ok);
    }
}
