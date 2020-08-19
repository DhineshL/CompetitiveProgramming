package com.company.Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LearningLanguage {
    public static int [] freq;
    public static int [] parent;
    public static int [] rank;
    public static int Find(int language){
        if (parent[language]==language)
            return language;
        return Find(parent[language]);
    }
    public static void Union(int num1,int num2){
        int a = Find(num1);
        int b = Find(num2);
        if (a==b)
            return;
        if (rank[a]<rank[b]) {
            parent[a] = b;
            rank[b]++;
        }
        else{
            parent[b]=a;
            rank[a]++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        freq = new int [m+1];
        parent = new int [m+1];
        rank = new int[m+1];
        for (int i =1; i <=m; i++) {
            parent[i]=i;
        }
        int no_language=0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            int n_ = Integer.parseInt(st.nextToken());
            if (n_==0){
                no_language++;
                continue;
            }
            int u = Integer.parseInt(st.nextToken());
            freq[u]++;
            for (int j = 1; j < n_; j++) {
                int v = Integer.parseInt(st.nextToken());
                Union(u,v);
                freq[v]++;
            }
        }
        int count=0;
        for (int i = 1; i <= m; i++) {
            if (parent[i]==i&&freq[i]>0)
                count++;
        }
        count--;
        if (no_language==n)
            System.out.println(n);
        else
            System.out.println(count+no_language);
    }
}
