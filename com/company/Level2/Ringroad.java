package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ringroad {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        long prev =Long.parseLong(st.nextToken());
        long min =prev-1;
        long task ;
        for (int i = 0; i < m-1; i++) {
            task = Long.parseLong(st.nextToken());
            if (task>=prev)
                min += task-prev;
            else{
                min += n-prev+task;
            }
            prev = task;
        }
        System.out.println(min);
    }
}
