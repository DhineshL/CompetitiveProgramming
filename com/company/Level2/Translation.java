package com.company.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Translation {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(bf.readLine());
        StringBuilder sb2 = new StringBuilder(bf.readLine());
        int len = sb.length();
        boolean flag = true;
        if (len!=sb2.length()){
            flag = false;
        }
        else {
            for (int i = 0; i < len; i++) {
                if (sb.charAt(i) != sb2.charAt(len - i - 1)) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
