package com.company.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Cakeminator {
    public static void main(String[] args) throws IOException {
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        Set<Integer> x_cord = new HashSet<>();
        Set<Integer> y_cord = new HashSet<>();
        for (int i = 1; i <= row; i++) {
            st = new StringTokenizer(bf.readLine());
            String pos = st.nextToken();
            for (int j = 1; j <= col; j++) {
                if (pos.charAt(j-1)=='S'){
                    x_cord.add(i);
                    y_cord.add(j);
                }
            }
        }
        System.out.println(row*col-(x_cord.size()*y_cord.size()));

    }
}
