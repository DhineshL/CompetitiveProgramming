package com.company.Level2;

import java.util.Scanner;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans =0;
        for (int i = 4000; i <=4000; i++) {
            for (int j = 0; j <=4000; j++) {
                double c_ = n- (a*i+b*j);
                c_ /=c;
                if (c_<0) break;
                if (c_%1==0){
                    ans = (int) Math.max(ans,i+j+c_);
                }
            }
        }
        System.out.println(ans);
    }
}
