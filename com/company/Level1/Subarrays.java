package com.company.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subarrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test_ = Integer.parseInt(bf.readLine());
        for (int i = 0; i < test_; i++) {
            int length = Integer.parseInt(bf.readLine());
            for (int j = 1; j <=length; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
