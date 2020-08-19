package com.company.Level1;

import java.util.Scanner;

public class DivBy8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        while (num>0){
            if(num%8==0)
                break;
            num /= 10;
        }
        if(num>0){
            System.out.println("YES");
            System.out.println(num);
        }
        else
            System.out.println("NO");
    }
}
