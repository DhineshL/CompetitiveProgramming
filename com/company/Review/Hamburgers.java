package com.company.Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hamburgers {
    public static long ib;
    public static long ic;
    public static long is;
    public static long pb;
    public static long pc;
    public static long ps;
    public static  long cb=0,cs=0,cc=0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='B') cb++;
            else if (str.charAt(i)=='S') cs++;
            else cc++;
        }
        StringTokenizer st = new StringTokenizer(bf.readLine());
        ib =Long.parseLong(st.nextToken());
        is = Long.parseLong(st.nextToken());
        ic = Long.parseLong(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        pb = Long.parseLong(st.nextToken());
        ps = Long.parseLong(st.nextToken());
        pc = Long.parseLong(st.nextToken());
        long r =Long.parseLong(bf.readLine());
        long low =0l,high= (long) 1e13,mid=0l;
        long price1 =0l;
        long ans=0l;
        while (low<=high){
            mid = (low+high)/2;
            price1 = price(mid);
            if (price1 <=r){
                ans = mid;
                low=mid+1;
            }
            if (price1>r){
                high=mid-1;
            }
        }
        System.out.print(ans);

    }
    public static long price(long x){
        long nb = Math.max(0,x*cb-ib);
        long nc = Math.max(0,x*cc-ic);
        long ns = Math.max(0,x*cs-is);
        return (long)nc*pc+nb*pb+ns*ps;

    }
}
