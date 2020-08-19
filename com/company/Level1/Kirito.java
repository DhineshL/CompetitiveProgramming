package com.company.Level1;

import java.util.Arrays;
import java.util.Scanner;

public class Kirito {
    public static  String levelPasser(long health,long [] [] dragon,int level,int no_dragons){
        if(level==no_dragons)
            return "YES";
        if(health>dragon[level][0])
            return levelPasser(health+dragon[level][1],dragon,level+1,no_dragons);
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long health = sc.nextLong();
        int no_dragons = sc.nextInt();
        long [] [] dragon = new long [no_dragons][2];
        for (int i = 0; i < no_dragons; i++) {
            for (int j = 0; j < 2; j++) {
                dragon[i][j] = sc.nextLong();
            }
        }
        Arrays.sort(dragon,(a,b)->Long.compare(a[0],b[0]));
        System.out.println(levelPasser(health,dragon,0,no_dragons));

    }
}
