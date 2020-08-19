package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Puzzles {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int puz []=new int[m];
        for (int i = 0; i < m; i++) {
            puz[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(puz);
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <= m-n; i++) {
            min = Math.min(min,puz[i+n-1]-puz[i]);
        }
        System.out.print(min);
    }
}
