package com.company.Level1;

import java.util.Arrays;
import java.util.Scanner;

public class Lantern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_lantern = sc.nextInt();
        double length = sc.nextInt();
        double lanterns [] = new double [no_lantern];
        for (int i = 0; i < no_lantern; i++) {
            lanterns[i] = sc.nextInt();
        }
        Arrays.sort(lanterns);
        double distance = Math.max(lanterns[0],(length-lanterns[no_lantern-1]));
        for (int i = 1; i < no_lantern; i++) {
            if(lanterns[i]<=length){
                distance = Math.max(distance,(lanterns[i]-lanterns[i-1])/2);
            }
        }
        System.out.println(distance);
    }
}
