package com.rwkj.demo.jikaoti;

import java.util.ArrayList;
import java.util.List;
/*
判断1-100之间有多少个素数，并输出所有素数。

程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，

则表明此数不是素数，反之是素数。
 */
public class PrimeNumber {

    public static void main(String[] args) {
        List<Integer> kk = new ArrayList<>();
        for (int i = 1;i<=100;i++) {
            boolean prime = isPrime(i);
            if (!prime){
                kk.add(i);
            }
        }
        System.out.println(kk);
    }


    private static boolean isPrime(int i) {
        boolean bol = false;
        if (i == 1) {
            return true;
        }

        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) {
                bol = true;
                break;
            }
        }
        return bol;
    }
}
