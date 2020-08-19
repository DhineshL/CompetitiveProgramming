package com.company.Level1;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index_i=0,index_j=0;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                int num = sc.nextInt();
                if(num==1){
                    index_i = i;
                    index_j = j;
                }
            }
        }
        int steps = Math.abs(3-index_i)+Math.abs(3-index_j);
        System.out.println(steps);
    }
}
