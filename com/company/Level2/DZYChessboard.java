package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DZYChessboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String [] chess = new String[n];
        for (int i = 0; i < n; i++) {
            chess[i] = bf.readLine();
        }
        String a ="W";
        String b = "B";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (chess[i].charAt(j)=='.') {
                    if (j%2==0)
                        System.out.print(b);
                    else
                        System.out.print(a);
                }
                else
                    System.out.print("-");
            }
            if (a=="W") {
                b = "W";
                a = "B";
            }
            else {
                b="B";
                a="W";
            }
            System.out.println("");
        }

    }
}
