package com.company.Level1;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        int comp = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)>b.charAt(i)){
                comp =1;
                break;
            }
            else if(a.charAt(i)<b.charAt(i)){
                comp =-1;
                break;
            }
        }
        System.out.println(comp);
    }
}
