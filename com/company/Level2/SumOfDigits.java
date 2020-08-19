package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String num = bf.readLine();
        int count=0;
        while (!num.matches("[0-9]")){
            int sum =0;
            for (int i = 0; i < num.length(); i++) {
                sum+=Integer.parseInt(String.valueOf(num.charAt(i)));
            }
            num = Integer.toString(sum);
            count++;
        }

        System.out.println(count);
    }
}
