package com.company.Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoutineProblem {
    public static double gcd(double a, double b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double c = Integer.parseInt(st.nextToken());
        double d = Integer.parseInt(st.nextToken());
        double p, q, g = 1;
        if (a / b > c / d) {
            p = a * d - b * c;
            q = a * d;
            g = gcd(p, q);
        } else  {
            p = b * c - a * d;
            q = b * c;
            g = gcd(p, q);
        }
        System.out.print((int)(p / g) + "/" +(int) (q / g));
    }
}
