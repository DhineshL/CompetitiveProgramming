package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SerejaAndSuffixes {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] result = new int[n+1];
        st = new StringTokenizer(bf.readLine());
        Set<String> set = new HashSet<>(n);
        String [] arr = new String[n+1];
        for (int i = 0; i < n; i++) {
            arr[i]=st.nextToken();
        }
        for (int i =n-1; i >=0; i--) {
            set.add(arr[i]);
            result[i+1]=set.size();
        }
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(bf.readLine());
            System.out.println(result[k]);
        }
    }
}
