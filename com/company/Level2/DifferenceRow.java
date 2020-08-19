package com.company.Level2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DifferenceRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int temp = arr[n-1];
        arr[n-1] = arr[0];
        arr[0]=temp;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
