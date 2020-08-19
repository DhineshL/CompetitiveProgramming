package com.company.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DivBy90 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int [] arr = new int[2];
        for (int i = 0; i <size; i++) {
            if (st.nextToken().equals("0"))
                arr[0]++;
            else
                arr[1]++;
        }
        if (arr[0]>0){
            int num = arr[1]%9;
            num = arr[1]-num;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < num; i++) {
                sb.append(5);
            }
            if (num>0){
                for (int i = 1; i < arr[0]; i++) {
                    sb.append(0);
                }
            }
            sb.append(0);
            System.out.println(sb);
        }

        else System.out.println(-1);

    }
}
