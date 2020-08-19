package com.company.Review;



import java.util.Scanner;
public class DreamoonAndWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int c_dist =0;
        int a_dict =0;
        int unknown=0;
        for (int i = 0; i < str1.length(); i++) {
            c_dist += (str1.charAt(i)=='+')?1:-1;
            if (str2.charAt(i)=='?')
                unknown++;
            else
                a_dict += (str2.charAt(i)=='+')?1:-1;
        }
        int dist = c_dist-a_dict;
        double ans;
        if ((unknown+dist)%2!=0||dist>unknown){
            ans=0;
        }
        else {
            int m= Math.abs(dist)+(unknown-Math.abs(dist))/2;
            double c=1;
            for (int i = 0; i <m; i++) {
                c *= unknown-i;
            }
            for (int i = 2; i <=m; i++) {
                c /=i;
            }
            ans = c/(1<<unknown);
        }
        System.out.println(ans);
    }
}
