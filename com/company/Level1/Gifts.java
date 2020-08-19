package com.company.Level1;

import java.util.Arrays;
import java.util.Scanner;

public class Gifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_ = sc.nextInt();
        long [] [] [] arr = new long [test_][][];
        for (int i = 0; i < test_; i++) {
            int size = sc.nextInt();
            arr[i] = new long[2][size];
            for (int j = 0; j < size; j++) {
                arr[i][0][j] = sc.nextLong();
            }
            for (int j = 0; j < size; j++) {
                arr[i][1][j] = sc.nextLong();
            }
        }
        for (long [][]arr1:arr) {
              Arrays.sort(arr1[0]);
              Arrays.sort(arr1[1]);
              long min_candy = arr1[0][0];
              long min_orange = arr1[1][0];
              int steps_candy =0,steps_orange=0 ;
            for (int i = 1; i < arr1[0].length; i++) {
                steps_candy+=(arr1[0][i]-min_candy);
            }
            for (int i = 1; i < arr1[0].length; i++) {
                steps_orange+=(arr1[1][i]-min_orange);
            }
            if(steps_candy>steps_orange) System.out.println(steps_candy);
            else System.out.println(steps_orange);
            System.out.println(steps_candy+"  "+steps_orange);
        }
    }
}
