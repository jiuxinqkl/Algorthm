package com.rwkj.demo.dac;

public class Hanoitower {
    public static void main(String[] args) {
        hanoiTower(2,'A','B','C');
        //hanoiTower(2,'A','B','C');
    }

    //韩罗塔移动的方法
    //
    public static void hanoiTower(int num,char a,char b,char c){
        if(num==1){
            System.out.println("第1个盘从"+a+ "->"+c);
        }else{
            hanoiTower(num-1,a,c,b);
            System.out.println("第"+num+"个盘从"+a+"->"+c);
            hanoiTower(num-1,b,a,c);
        }

    }
}
