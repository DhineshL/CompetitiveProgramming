package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HarukiGift {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int [] apples = new int[2];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            String weight = st.nextToken();
            if (weight.equals("200"))
                apples[1]++;
            else
                apples[0]++;
        }
        int sum = apples[0]*100+apples[1]*200;
        boolean flag = false;
        if ((sum/100)%2==0){
            for (int i = 0; i <=apples[1]; i++) {
                for (int j = 0; j <=apples[0]; j++) {
                    if (i*200+j*100==sum/2){
                        flag=true;
                        break;
                    }
                }
            }
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
