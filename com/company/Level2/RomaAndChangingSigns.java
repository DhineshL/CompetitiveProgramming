package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class RomaAndChangingSigns {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int i=0;
        while (i<n&&i<m){
            if (arr[i]<0) arr[i] = -arr[i];
            else break;
            i++;
        }
        m -=i;
        int minindex;
        if (m>0&&m%2==1){
            minindex = IntStream.range(0,arr.length).reduce((k,j)->arr[k]>arr[j]?j:k).getAsInt();
            arr[minindex]=-arr[minindex];
        }

        System.out.println(Arrays.stream(arr).sum());

        }
}
