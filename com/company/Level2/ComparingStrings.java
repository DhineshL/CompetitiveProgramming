package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComparingStrings {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String gen1 = bf.readLine();
        String gen2 = bf.readLine();
        if (gen1.length()==gen2.length()){
            int count=0;
            int [] pos = new int[2];
            for (int i = 0; i < gen1.length(); i++) {
                if (gen1.charAt(i)==gen2.charAt(i)) continue;
                if (gen1.charAt(i)!=gen2.charAt(i)&&count<2){
                    pos[count]=i;
                    count++;
                }
                else {
                    count++;
                    break;
                }
            }
            if (count==2&&gen1.charAt(pos[0])==gen2.charAt(pos[1])&&gen1.charAt(pos[1])==gen2.charAt(pos[0]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
            System.out.println("NO");
    }
}
