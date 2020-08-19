package com.company.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bit__ {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int no_ = Integer.parseInt(bf.readLine());
        int x =0;
        for (int i = 0; i < no_; i++) {
            String operation = bf.readLine();
            if (operation.equals("++X")||operation.equals("X++"))
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}
