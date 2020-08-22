package com.company.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class LuckyNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Long> lucky = new TreeSet<>();
        for (int i =2; i <=10; i+=2) {
            for (int j = 1; j < (1<<i); j++) {
                if (Integer.bitCount(j)<<1==i){
                    long cur =0;
                    for (int k = 0; k <i; k++) {
                        cur *=10;
                        if ((j&(1<<k))!=0){
                            cur+=7;
                        }
                        else
                            cur+=4;
                    }
                    lucky.add(cur);
                }
            }
        }
        System.out.print(lucky.ceiling(Long.parseLong(bf.readLine())));
    }
}
