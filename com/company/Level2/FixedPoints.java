package com.company.Level2;

import java.util.Scanner;

public class FixedPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int count =0;
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            if (arr[i]==i) {
                arr[i] = -1;
                count++;
            }
        }
        int add =1;
        for (int i = 0; i < n; i++) {
           int pos = arr[i];
           if (pos!=-1&&arr[pos]==i)
               add=2;
        }
        if (count==n)
            System.out.println(n);
        else
            System.out.println(count+add);
    }
}
