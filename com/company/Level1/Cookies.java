package com.company.Level1;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_bags = sc.nextInt();
        int odd=0;
        for (int i = 0; i < no_bags; i++) {
            int bag = sc.nextInt();
            if(! (bag%2==0)) odd++;
        }
        if (odd%2==0) System.out.println(no_bags-odd);
        else System.out.println(odd);

    }
}
