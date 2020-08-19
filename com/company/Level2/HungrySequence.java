package com.company.Level2;


import java.util.Scanner;

public class HungrySequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(2*n);
        for (int i = 2; i <= n; i++) {
            System.out.print(" "+(2*n+(i-1)));
        }

    }
}
