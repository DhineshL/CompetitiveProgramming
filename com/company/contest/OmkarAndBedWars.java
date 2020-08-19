package com.company.contest;

import java.util.Scanner;

public class OmkarAndBedWars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < test; i++) {
            int n = Integer.parseInt(sc.nextLine());
            String str = sc.nextLine();
            int count =0;
            for (int j = 0; j < n-3; j++) {
                if (str.charAt(j)==str.charAt(j+1)&&str.charAt(j+2)==str.charAt(j+1))
                    count++;
            }
            if (str.charAt(n-2)==str.charAt(n-1)&&str.charAt(0)==str.charAt(n-1))
                count++;

        }
    }
}
