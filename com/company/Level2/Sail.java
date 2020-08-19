package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sail {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int time = Integer.parseInt(st.nextToken());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int dist_x = x2-x1;
        int dist_y = y2-y1;
        int count =0;
        String str = bf.readLine();
        for (int i = 0; i < time; i++) {
            if (dist_x>0&&str.charAt(i)=='E') {
                dist_x--;
            }
            else if (dist_x<0&&str.charAt(i)=='W') {
                dist_x++;
            }
            else if (dist_y>0&&str.charAt(i)=='N') {
                dist_y--;
            }
            else if (dist_y<0&&str.charAt(i)=='S') {
                dist_y++;
            }
            count++;
            if (dist_x==0&&dist_y==0) {
                break;
            }
        }
       if (count<=time&&(dist_x==0&&dist_y==0))
           System.out.println(count);
       else
           System.out.println(-1);
    }
}
