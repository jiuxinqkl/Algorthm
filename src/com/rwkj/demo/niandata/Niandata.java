package com.rwkj.demo.niandata;

/**
 * 年计算方法
 */

public class Niandata {
    public static void main(String[] args) {
      int sum =0;
        for (int year=1900; year<=2019; year ++) {
           if (year%4==0&&year%100!=0||year%400==0){
               sum+=366;
           }else{
               sum+=365;
           }
        }
        System.out.println(sum);
    }
}

