package com.company.Level1;

import java.util.Scanner;

public class ArrivalOfGeneral {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int min=Integer.MAX_VALUE;
        int min_index=0;
        int max=Integer.MIN_VALUE;
        int max_index=0;
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            if(num>max){
                max = num;
                max_index=i;
            }
            if(num<=min){
                min =num;
                min_index=i;
            }
        }
        int steps = (size-1-min_index)+(max_index);
        if(min_index<max_index) steps--;
        System.out.println(steps);
    }
}
