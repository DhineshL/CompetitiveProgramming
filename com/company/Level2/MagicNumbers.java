package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicNumbers {
    public static boolean isMatch(String str){
        if (str.charAt(0)!='1')
            return false;
        if (str.contains("444"))
            return false;
        for (int i = 1; i <str.length(); i++) {
            if (str.charAt(i)=='1'||str.charAt(i)=='4')
                continue;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        if (isMatch(str))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
