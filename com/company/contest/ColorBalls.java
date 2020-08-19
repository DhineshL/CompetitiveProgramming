package com.company.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColorBalls {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test_ = Integer.parseInt(bf.readLine());
        String [] ans = new String[test_];
        for (int i = 0; i < test_; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int no_red = Integer.parseInt(st.nextToken());
            int no_blue = Integer.parseInt(st.nextToken());
            int no_green = Integer.parseInt(st.nextToken());
            int no_white = Integer.parseInt(st.nextToken());
            boolean flag = false;
                int even =0;
                if (no_blue%2==0){
                    even++;
                }
                if (no_red%2==0){
                    even++;
                }
                if (no_green%2==0){
                    even++;
                }
                if (no_white%2==0) even++;

                if (even==4||even==3){
                    flag=true;
                }
                else if (even==1&&(no_green!=0&&no_blue!=0&&no_red!=0)){
                    flag =true;
                }
            if (flag) ans[i]="YES";
            else ans[i]="NO";
        }
        for (int i = 0; i < test_; i++) {
            System.out.println(ans[i]);
        }
    }
}
