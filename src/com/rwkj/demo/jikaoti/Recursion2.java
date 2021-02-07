package com.rwkj.demo.jikaoti;

/**
 * 第 1 个人 10，第 2 个比第 1 个人大 2 岁，依次递推，请用递归方式计算出第 8
 * 个人多大？
 */
public class Recursion2 {
    public static void main(String [] args)
    {
        System.out.println(computeAge(8));
      //  System.out.println(cou(135142857));
    }

    public static int  computeAge( int n){
        if(n==1) return 10;
        return computeAge(n-1) +2;

    }

 /*   public static int cou(int n1){
        return n1*3 + n1*3 ;
    }*/
}
