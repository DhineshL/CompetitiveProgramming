package com.company.Level1;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String [] words = new String[count];
        for (int i = 0; i < count; i++) {
            words[i] = sc.nextLine();
        }
        for (String word:words) {
            if(word.length()>10)
                System.out.println(word.charAt(0)+""+(word.length() -2)+""+word.charAt(word.length()-1));
            else
                System.out.println(word);
        }
    }
}
