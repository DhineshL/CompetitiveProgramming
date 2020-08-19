package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTask {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        str=str.toLowerCase();
        str=str.replaceAll("[aeiouy]","");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <str.length(); i++) {
            sb.append(".");
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
