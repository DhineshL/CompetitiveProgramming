package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SerejaAndArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());

        }
        int add=0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            int op_ = Integer.parseInt(st.nextToken());
            int index_ = Integer.parseInt(st.nextToken());
            int element=0;
            if (op_==1) {
                element = Integer.parseInt(st.nextToken());
                arr[index_-1] = element;
                arr[index_-1] -= add;
            }
            else if (op_==2){
                add += index_;
            }
            else if (op_==3){
                System.out.println(arr[index_-1]+add);
            }

        }
    }
}
