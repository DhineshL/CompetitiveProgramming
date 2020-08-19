package com.company.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class AppleJack {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int init_planks = Integer.parseInt(sc.readLine());
        StringTokenizer st = new StringTokenizer(sc.readLine());
        HashMap<Integer,Integer> store = new HashMap<>();
        int pair_2=0,pair_4=0,pair_6=0,pair_8=0;
        for (int i = 0; i < init_planks; i++) {
            int plank =Integer.parseInt(st.nextToken());
            if(store.containsKey(plank)) store.put(plank,store.get(plank)+1);
            else store.put(plank,1);
            int freq = store.get(plank);
            switch (freq){
                case 8:pair_8++;break;
                case 6:pair_6++;break;
                case 4:pair_4++;break;
                case 2:pair_2++;
            }
            }
        int events = Integer.parseInt(sc.readLine());
        for (int i=0;i<events;i++){
            st = new StringTokenizer(sc.readLine());
            String sign = st.nextToken();
            int event = Integer.parseInt(st.nextToken());
            if (sign.equals("+")){
                if(store.containsKey(event)) store.put(event,store.get(event)+1);
                else store.put(event,1);
                int freq = store.get(event);
                switch (freq){
                    case 8:pair_8++;break;
                    case 6:pair_6++;break;
                    case 4:pair_4++;break;
                    case 2:pair_2++;
                }
            }
            else if (sign.equals("-")){
                int freq = store.get(event);
                store.put(event,store.get(event)-1);
                switch (freq){
                    case 8:pair_8--;break;
                    case 6:pair_6--;break;
                    case 4:pair_4--;break;
                    case 2:pair_2--;
                }
            }
            System.out.println(isPossible(pair_8,pair_6,pair_4,pair_2));
        }
    }
    public static String isPossible(int pair8,int pair6,int pair4,int pair2){
        if (pair8>0) return "YES";
        if (pair6>0&&pair2>1) return "YES";
        if (pair4>=2) return "YES";
        if (pair4>=1&&pair2>=3) return "YES";
        return "NO";
    }
}
