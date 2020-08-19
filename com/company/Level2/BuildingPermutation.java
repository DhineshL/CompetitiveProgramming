package com.company.Level2;

import java.util.*;

public class BuildingPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        for (int i = 1; i <=n; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        long move =0;
        for (int i = 0; i <n; i++) {
            move += Math.abs(arr.get(i)-i-1);
        }
        System.out.println(move);
    }

}
