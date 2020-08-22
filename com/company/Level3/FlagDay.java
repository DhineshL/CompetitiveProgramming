package com.company.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class FlagDay {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] colors = new int[n+1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            List<Integer> color = new LinkedList<>();
            color.add(1);
            color.add(2);
            color.add(3);
            List<Integer> dancer = new LinkedList<>();
            for (int j = 1; j <=3; j++) {
                int d = Integer.parseInt(st.nextToken());
                if (colors[d]!=0) {
                    color.remove(Integer.valueOf(colors[d]));
                    continue;
                }
                dancer.add(d);
            }
            for (int d:dancer) {
                colors[d]=color.remove(0);
            }
        }
        System.out.print(colors[1]);
        for (int i = 2; i < n+1; i++) {
            System.out.print(" "+colors[i]);
        }
    }
}
