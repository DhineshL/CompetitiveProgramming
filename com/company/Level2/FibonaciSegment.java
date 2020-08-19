package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FibonaciSegment {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        Set<Integer> segment = new HashSet<>();
        segment.add(1);
        int n2=0;
        if (n>1) {
            n2 = Integer.parseInt(st.nextToken());
            segment.add(2);
        }
        int len=2;
        for (int i = 2; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (n1+n2==num){
               segment.add(++len);
            }
            else len=2;
            n1=n2;
            n2=num;
        }
        System.out.println(Collections.max(segment));
    }
}
