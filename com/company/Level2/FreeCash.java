package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

public class FreeCash {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String cur = bf.readLine();
            if (map.containsKey(cur)) map.put(cur,map.get(cur)+1);
            else map.put(cur,1);
        }
        System.out.println(Collections.max(map.values()));
    }
}
