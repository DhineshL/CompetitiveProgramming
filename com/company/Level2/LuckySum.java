package com.company.Level2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LuckySum {
    public static long luckySum(long n ,long[] lucky_num){
        long ans=0;
        for (int i = 1; i < lucky_num.length; i++) {
            if (lucky_num[i]<n){
                ans = ans+ lucky_num[i]*(lucky_num[i]-lucky_num[i-1]);
            }
            else{
                ans = ans+ lucky_num[i]*(n-lucky_num[i-1]);
                break;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        long lucky_num [] = new long[1025];
        lucky_num[1]=4;
        lucky_num[2]=7;
        int t=3;
        for (int i = 1; i<512; i++) {
            lucky_num[t++] = lucky_num[i]*10+4;
            lucky_num[t++] = lucky_num[i]*10+7;
        }
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        long l = Long.parseLong(st.nextToken());
        long r = Long.parseLong(st.nextToken());
        System.out.print(luckySum(r,lucky_num)-luckySum(l-1,lucky_num));

    }
}
