package com.rwkj.demo.jikaoti;

import java.util.ArrayList;
import java.util.List;
/*
完数
 */
public class PerfectCount {
    public static void main(String[] args) {
        List<Integer> kk = new ArrayList<>();
        for (int i = 6; i < 100000; i++) {
            boolean bol = isPerfectNumber(i);
            if (bol){
                kk.add(i);
            }
        }
        System.out.println(kk);
    }

    private static boolean isPerfectNumber(int i) {
        int number = 0;
        for (int k = 1;k<=i/2;k++) {
            if (i%k == 0){
                number = number + k;
            }
        }
        if (i == number){
            return true;
        }
        return false;
    }
}
