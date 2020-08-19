package com.company.Level2;

import java.util.*;

public class LittleGirlAndGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) map.put(str.charAt(i),map.get(str.charAt(i))+1);
            else map.put(str.charAt(i),1);
        }
        List<Integer> values = new ArrayList<>(map.values()) ;
        int count = (int) values.stream().filter(x->x%2==1).count();
        if (count%2!=0||count==0) System.out.println("First");
        else  System.out.println("Second");
    }
}
