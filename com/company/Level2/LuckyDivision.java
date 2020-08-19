package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyDivision {
    public static boolean isLucky(String str){
        for (int i = 0; i <str.length(); i++) {
            if (!(str.charAt(i)=='4'||str.charAt(i)=='7'))
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        boolean flag = false;
        if (!isLucky(str)){
            int n = Integer.parseInt(str);
            for (int i = 1; i <n; i++) {
                if ((isLucky(i+"") && n%i==0)) {
                    flag=true;
                    break;
                }
            }
        }
        else flag=true;
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
