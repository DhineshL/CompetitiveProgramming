package com.company.Level1;

import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i)=='H'||p.charAt(i)=='Q'||p.charAt(i)=='9'){
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
