package com.company.Level1;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_ = sc.nextInt();
        int [] [] arr = new int[test_][];
        for (int i = 0; i < test_; i++) {
            int size = sc.nextInt();
            arr[i] = new int[size];
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int arr1[]: arr) {
            Arrays.sort(arr1);
            Boolean flag = true;
            for (int i = 0; i < arr1.length-1; i++) {
                if (! (arr1[i+1]-arr1[i] <=1&& (arr1[i+1]-arr1[i]>=0))){
                    flag = false;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
