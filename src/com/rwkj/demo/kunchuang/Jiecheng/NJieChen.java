package com.rwkj.demo.kunchuang.Jiecheng;

import java.util.Scanner;

public class NJieChen {
    public static void main(String[] args){

        Scanner m=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n=m.nextInt();
        int i=1,s=1;
        for(i=1;i<=n;i++)
        {
            s*=i;
        }
        System.out.println("s="+s+"  i="+i);
    }
}
