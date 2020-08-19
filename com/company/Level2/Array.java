package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Array {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();
        List<Integer> n3 = new ArrayList<>();
        n3.add(0);
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num>0)
                n2.add(num);
            else if (num<0)
                n1.add(num);
        }
        if (n1.size()%2==0){
            n3.add(n1.remove(1));
        }
        if (n2.size()==0){
            n2.add(n1.remove(1));
            n2.add(n1.remove(1));
        }
        System.out.print(n1.size());
        for (int x:n1){
            System.out.print(" "+x);
        }
        System.out.println("");
        System.out.print(n2.size());
        for (int x:n2){
            System.out.print(" "+x);
        }
        System.out.println("");
        System.out.print(n3.size());
        for (int x:n3){
            System.out.print(" "+x);
        }
    }
}