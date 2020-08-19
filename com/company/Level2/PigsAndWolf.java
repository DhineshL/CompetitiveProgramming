package com.company.Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PigsAndWolf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char [][] cells = new char[n][m];
        boolean[][] visited = new boolean[n][m];
        int [] dx ={0,1,0,-1};
        int [] dy ={1,0,-1,0};
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j <m; j++) {
                cells[i][j]=str.charAt(j);
            }
        }
        int count=0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                if (cells[i][j]=='W'){
                    int x,y;
                    for (int k = 0; k < 4; k++) {
                        x=i+dx[k];
                        y=j+dy[k];
                        if (!(x>=0&&x<n&&y>=0&&y<m)||visited[x][y])
                            continue;
                        visited[x][y]=true;
                        if (cells[x][y]=='P') {
                            count++;
                            break;
                        }
                    }
                }
            }

        }
        System.out.print(count);
    }
}
