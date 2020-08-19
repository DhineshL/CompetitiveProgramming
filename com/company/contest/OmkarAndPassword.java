package com.company.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OmkarAndPassword {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(bf.readLine());
        for (int i = 0; i < test; i++) {
            int n = Integer.parseInt(bf.readLine());
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int temp = Integer.parseInt(st.nextToken());
            int count =1;
            for (int j = 1; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num==temp) count++;
            }

            if (count==n) System.out.println(n);
            else System.out.println(1);
        }
    }
}
