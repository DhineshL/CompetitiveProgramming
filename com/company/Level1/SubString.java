package com.company.Level1;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean match = false;
        boolean fullMatch = false;
        for (int i = 0; i < str.length()-1; i++) {
            if (!match&&str.substring(i,i+2).equals("AB")){
                match =true;
                i++;
            }
            else if(match){
                if(str.substring(i,i+2).equals("BA"))
                    fullMatch = true;
            }
        }
        if (!fullMatch){
            match = false;
            for (int i = 0; i < str.length()-1; i++) {
                if (!match&&str.substring(i,i+2).equals("BA")){
                    match =true;
                    i++;
                }
                else if(match){
                    if(str.substring(i,i+2).equals("AB"))
                        fullMatch = true;
                }
            }
        }
        if (fullMatch)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
