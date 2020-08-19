package com.company.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VasilyBearTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cord_ =Math.abs(a)+Math.abs(b);
        if (a<0&&b>0){
            System.out.println(-cord_+" "+0+" "+0+" "+cord_);
        }
        else if (a<0&&b<0)
            System.out.println(-cord_+" "+0+" "+0+" "+-cord_);
        else if (a>0&&b>0)
            System.out.println(0+" "+cord_+" "+cord_+" "+0);
        else
            System.out.println(0+" "+-cord_+" "+cord_+" "+0);
    }
}
