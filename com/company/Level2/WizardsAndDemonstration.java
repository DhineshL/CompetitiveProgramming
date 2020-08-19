package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WizardsAndDemonstration {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        double n = Double.parseDouble(st.nextToken());
        double wiz = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken())/100;
        System.out.println(new Integer((int) Math.max(Math.ceil(n*y)-wiz,0)));
    }
}
