package com.company.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColoredRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int iter;
        if (r>g){
            if (r<b)
                iter=r;
            else
                iter=b;
        }
        else{
            if (g<b)
                iter=g;
            else
                iter=b;
        }
        st = new StringTokenizer(bf.readLine());
        
    }
}
