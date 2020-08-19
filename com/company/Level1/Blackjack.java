package com.company.Level1;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        sum -= 10;
        int cards = 0;
        if (sum==10)
            cards = 15;
        else if ((sum >=1 && sum<10) ||sum==11)
            cards = 4;
        System.out.println(cards);

    }
}
