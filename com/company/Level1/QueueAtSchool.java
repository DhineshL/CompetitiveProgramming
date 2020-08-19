package com.company.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueueAtSchool {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int size = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder(bf.readLine());
        while (time-->0){
            for (int i = 0; i < size-1;i++) {
                if (sb.charAt(i)=='B'&& sb.charAt(i+1)=='G') {
                    sb.setCharAt(i, 'G');
                    sb.setCharAt(i + 1, 'B');
                    i += 1;
                }
            }
        }
        System.out.println(sb);
    }
}
