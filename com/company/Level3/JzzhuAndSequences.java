package com.company.Level3;


import java.util.Scanner;

public class JzzhuAndSequences {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        long ans=0l;
        switch (n%6){
            case 1:ans=x;break;
            case 2:ans=y;break;
            case 3:ans=y-x;break;
            case 4:ans=-x;break;
            case 5:ans=-y;break;
            case 0:ans=x-y;
        }
        long mod = (long)1e9+7;
        System.out.print((long)(ans+3*mod)%mod);

    }
}
