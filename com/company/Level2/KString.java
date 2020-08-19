package com.company.Level2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class KString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k =Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (map.containsKey(temp)) map.put(temp,map.get(temp)+1);
            else map.put(temp,1);
        }
        Set<Map.Entry<Character,Integer>> entries = map.entrySet();
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> entry:entries) {
            Character key = entry.getKey();
            int count = entry.getValue();
            if (count%k==0 && count!=0) {
                for (int i = 0; i < count/k; i++) {
                    sb.append(key);
                }
            }
            else {
                flag = false;
                break;
            }
        }
        if (flag){
            for (int i = 0; i <k; i++) {
                System.out.print(sb);
            }
        }
        else {
            System.out.print(-1);
        }
    }
}
