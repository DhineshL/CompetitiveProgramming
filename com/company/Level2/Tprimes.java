package com.company.Level2;

import java.util.*;

public class Tprimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long [] prime = new long[1000005];
        prime[0]=1;
        prime[1]=1;
        for (long i = 2; i <1000005 ; i++) {
            if (prime[(int)i]==0) {
                for (long j = i * i; j < 1000005; j += i) {
                    prime[(int) j] = 1;
                }
            }
        }
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();

           if (Math.sqrt(num)%1==0&&prime[(int) Math.sqrt(num)]==0)
                System.out.println("YES");
           else
                System.out.println("NO");
      }
    }

}
