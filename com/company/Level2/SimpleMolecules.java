package com.company.Level2;


import java.util.Scanner;

public class SimpleMolecules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        if ((sum)%2==0){
            sum /=2;
            int x = sum-c;
            int y = sum-a;
            int z = sum-b;
            if (x>=0&&y>=0&&z>=0)
                System.out.println(x+" "+y+" "+z);
            else
                System.out.println("Impossible");
        }
        else
            System.out.println("Impossible");

    }
}
