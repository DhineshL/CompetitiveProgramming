package com.company.Level1;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int min=0,max = 0;
        int amazing=0;
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            if (i==0)
                min=max=score;
            if (score>max){
                max=score;
                amazing++;
            }
            else if(score<min){
                min=score;
                amazing++;
            }
        }
        System.out.println(amazing);
    }
}
