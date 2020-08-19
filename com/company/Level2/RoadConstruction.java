package com.company.Level2;

import java.util.Arrays;
import java.util.Scanner;

public class RoadConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] no_road = new int[2*m];
        for (int i = 0; i <2*m; i++) {
            no_road[i] = sc.nextInt();
        }
        Arrays.sort(no_road);
        int center =1;
        for (int city:no_road) {
            if (center==city)
                center++;
        }
        System.out.println(n-1);
        for (int i = 1; i <=n; i++) {
            if (i==center) continue;
            else System.out.println(i+" "+center);
        }
    }
}
