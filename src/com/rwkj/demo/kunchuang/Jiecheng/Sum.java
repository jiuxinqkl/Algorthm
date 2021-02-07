package com.rwkj.demo.kunchuang.Jiecheng;
//计算1/1+1/2.....+1/100
public class Sum {
    public static void main(String[] args) {
        Double sum=0.0;

        for (int i = 1; i <=100; i++) {
            sum +=1.0/(double)i;

        }
        System.out.println("sum"+sum);
    }

}