package com.company.Level1;

import java.util.Scanner;

public class CandyBags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=1;
        int sum = 1+n*n;
        for (int i = 1; i <=n; i++) {
            for (int j =0; j <n/2; j++) {
                System.out.print(temp+++" ");
            }
            int last = temp;
            for (int j = 0; j <n/2; j++) {
                System.out.print(sum-(--last)+" ");
            }
            System.out.println("");
        }
    }
}
