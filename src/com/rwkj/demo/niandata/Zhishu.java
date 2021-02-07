package com.rwkj.demo.niandata;

/**
 * 质数
 */

public class Zhishu {
    public static void main(String[] args) {
        for(int i=2;i<=100000;i++){
            boolean isFlag=true;
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if(i%j==0){
                    isFlag=false;
                    break;
                }

            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }

}
