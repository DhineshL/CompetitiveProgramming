package com.company.Level1;

import java.util.Scanner;

public class Boats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            int size = sc.nextInt();
            int [] count = new int [size+1];
            for (int i = 0; i < size; i++) {
                int x = sc.nextInt();
                ++count[x];
            }
            int ans =0;
            for (int s = 1; s <=2*size; s++) {
                int cur = 0;
                for (int i = 1; i <(s+1)/2 ; i++) {
                    if (s-i>size)continue;
                    cur += Math.min(count[s-i],count[i]);
                }
                if (s%2==0) cur+= count[s/2]/2;
                ans = Math.max(ans,cur);
            }
            System.out.println(ans);
        }
    }
}

