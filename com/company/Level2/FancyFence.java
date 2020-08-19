package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FancyFence {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test_ = Integer.parseInt(bf.readLine());
        while (test_-->0){
            double a = Integer.parseInt(bf.readLine());
            for (double i = 3; ; i++) {
                double polygon_angle = (i-2)*180/i;
                if (polygon_angle==a){
                    System.out.println("YES");
                    break;
                }
                else if (polygon_angle>a){
                    System.out.println("NO");
                    break;
                }
            }
        }

    }
}
