package com.company.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int mx=x , my=y;
        boolean visited [][] = new boolean[n+1][m+1];
        visited[x][y]=true;
        System.out.println(x+" "+y);
        while ( true ){
            if (my+1 !=m+1&&!visited[mx][my+1])
                my++;
            else if (mx+1!=n+1&&!visited[mx+1][my])
                mx++;
            else if (mx-1!=0&&!visited[mx-1][my])
                mx--;
            else if (my-1 !=0&&!visited[mx][my-1])
                my--;
            else
                break;
            System.out.println(mx+" "+my);
            visited[mx][my]=true;
        }

    }
}
