package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rozdil {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
        int no = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int min = Integer.parseInt(st.nextToken());
        int count = 0;
        int city = 0;
        for (int i = 1; i < no; i++) {
            int dist = Integer.parseInt(st.nextToken());
            if (dist<min){
                min = dist;
                count =0;
                city =i;
            }
            else if (min==dist) count++;
        }
        if (count==0)
            System.out.println(city+1);
        else
            System.out.println("Still Rozdil");
    }
}
