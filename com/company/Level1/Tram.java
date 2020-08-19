package com.company.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Tram {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n_stops = Integer.parseInt(bf.readLine());
        int curr=0,max=0;
        for (int i = 0; i < n_stops; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());
            curr -= out;
            curr += in;
            if (curr>max)
                max = curr;
        }
        System.out.println(max);
    }
}
