package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WithoutZeros {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String no1 = bf.readLine();
        String no2 = bf.readLine();
        String  sum = (Integer.parseInt(no1)+Integer.parseInt(no2))+"";
        no1=no1.replaceAll("0","");
        no2=no2.replaceAll("0","");
        sum=sum.replaceAll("0","");
        if (Integer.parseInt(no1)+Integer.parseInt(no2)==Integer.parseInt(sum))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
