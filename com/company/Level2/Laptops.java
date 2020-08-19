package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Laptops {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int [][] laptops = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            laptops[i][0] =Integer.parseInt(st.nextToken());
            laptops[i][1] =Integer.parseInt(st.nextToken());
        }
        Arrays.sort(laptops, Comparator.comparingInt(x->x[0]));
        System.out.print(isGood(laptops));
    }
    public static String isGood(int [][]laptops){
        for (int i = 0; i < laptops.length-1; i++) {
            if (laptops[i][1]>laptops[i+1][1])
                return "Happy Alex";
        }
        return "Poor Alex";
    }
}
