package com.company.Level1;

import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String ans="";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)==b.charAt(i))
                ans+="0";
            else
                ans+="1";
        }
        System.out.println(ans);
    }
}
