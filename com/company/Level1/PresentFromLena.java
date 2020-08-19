package com.company.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PresentFromLena {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = -n ; i <=n; i++) {
            int top = n-Math.abs(i);
            for (int j = 0; j < Math.abs(i); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < top; j++) {
                System.out.print(j+" ");
            }
            for (int j =top; j >0 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println(0);

        }

    }
}
