package com.company.Level3;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Coach {
    public static class DSU{
        int [] parent;
        public DSU(int n) {
            parent = new int[n+1];
            for (int i = 1; i <=n; i++) {
                parent[i]=i;
            }
        }
        public int find(int i){
            if (parent[i]==i)
                return i;
            return parent[i]=find(parent[i]);
        }
        public void union(int x,int y){
            int a = find(x);
            int b = find(y);
            if (a!=b) {
                parent[b]=a;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        DSU dsu = new DSU(n);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            dsu.union(a,b);
        }
        List<Integer> [] arr = new List[n+1];
        for (int i = 1; i <=n ; i++) {
            arr[i]= new ArrayList<>();
        }
        int [] count = new int[n+1];
        for (int i = 1; i <=n; i++) {
            count[dsu.find(i)]++;
            arr[dsu.find(i)].add(i);
        }
        StringBuilder sb = new StringBuilder();
        List<Integer> one = new LinkedList<>();
        List<Integer> two = new LinkedList<>();
        for (int i = 1; i <=n; i++) {
            if (count[i]>3){
                System.out.print(-1);
                return;
            }
            else if (count[i]==3){
                sb.append(arr[i].get(0)+" "+arr[i].get(1)+" "+arr[i].get(2)+"\n");
            }
            else if (count[i]==2){
                two.add(i);
            }
            else if (count[i]==1){
                one.add(i);
            }
        }
        if (two.size()>one.size()){
            System.out.print(-1);
            return;
        }
        int j=0;
        for (int i:two) {
            sb.append(arr[i].get(0)+" "+arr[i].get(1)+" "+arr[one.get(j)].get(0)+"\n");
            j++;
        }
        while (j<one.size()){
            sb.append(one.get(j++)+" "+one.get(j++)+" "+one.get(j++)+"\n");
        }
        System.out.print(sb);
    }
}
