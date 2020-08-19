package com.company.Level2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Football {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int arr[ ] = new int[2];
        String team1 = bf.readLine();
        arr[0]++;
        String team2  ="";
        for (int i =1; i < n; i++) {
            String str = bf.readLine();
            if ((!str.equals(team1))&&team2==""){
                team2 = str;
            }
            if (str.equals(team1))
                arr[0]++;
            else {
                arr[1]++;
            }
        }
        if (arr[0]>arr[1])
            System.out.println(team1);
        else
            System.out.println(team2);
    }
}
