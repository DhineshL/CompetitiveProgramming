package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NextTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int ans =1;
        for (int i = 0; i <n; i++) {
            if (i == n-1 ){
                if (arr[i]==ans)
                    ans++;
                break;
            }
            if (arr[i]==ans)
                ans++;
            if (arr[i]+1 != arr[i+1]) {
                break;
            }
        }
        System.out.print(ans);
    }
}
