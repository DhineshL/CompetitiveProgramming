package com.company.Level2;

import java.util.Arrays;
import java.util.Scanner;

public class PashmakAndFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int arr [] = new int[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int min_ = arr[0];
        int max_ = arr[(int) (n-1)];
        long min_count=0l;
        long max_count=0l;
        if (max_!=min_) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == min_) min_count++;
                else break;
            }
            for (int i = (int) (n - 1); i >= 0; i--) {
                if (arr[i] == max_) max_count++;
                else break;
            }
            System.out.print(max_-min_+" "+(max_count*min_count));
        }
        else{
            System.out.println(0+" "+(long)n*(n-1)/2);
        }
    }
}
