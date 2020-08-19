package com.company.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class LittleDimaAndEquation {
    public static void main(String[] args) throws IOException  {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 81; i++) {
            int x = (int) (b*Math.pow(i,a)+c);
            if (x<=0) continue;
            int sum =0;
            int ans =x;
            while (x>0){
                sum +=x%10;
                x/=10;
            }
            if (sum==i&&ans<1000000000)
                list.add(ans);
        }
        System.out.println(list.size());
        if (list.size()>0)
            System.out.print(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            System.out.print(" "+list.get(i));
        }
    }
}
