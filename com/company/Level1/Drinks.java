package com.company.Level1;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum =0;
        for (int i = 0; i <n; i++) {
            sum += sc.nextDouble();
        }
        System.out.println(sum/n);
    }
}
