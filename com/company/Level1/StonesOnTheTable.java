package com.company.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StonesOnTheTable {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String str = st.nextToken();
        int count =0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)==str.charAt(i-1))
                count++;
        }
        System.out.println(count);
    }
}
