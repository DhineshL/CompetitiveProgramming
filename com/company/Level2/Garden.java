package com.company.Level2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Garden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int x1=Integer.parseInt(st.nextToken());
        int y1=Integer.parseInt(st.nextToken());
        int x2=Integer.parseInt(st.nextToken());
        int y2=Integer.parseInt(st.nextToken());
        if (x1==x2){
            System.out.print((x1+Math.abs(y2-y1))+" "+y1+" "+(x2+Math.abs(y2-y1))+" "+y2);
        }
        else if (y1==y2){
            System.out.print((x1+" "+(y1+Math.abs(x2-x1))+" "+x2+" "+(y2+Math.abs(x2-x1))));
        }
        else if (Math.abs(x2-x1)==Math.abs(y2-y1)){
            if (x1>x2)
                System.out.print(x1+" "+y2+" "+x2+" "+y1);
            else
                System.out.print(x2+" "+y1+" "+x1+" "+y2);
        }
        else
            System.out.print(-1);
    }
}
