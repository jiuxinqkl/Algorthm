package com.rwkj.demo.kunchuang;

public class SortString {

    private static final String str = "ABCDEF";

    public static void main(String[] args) {

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }


       // StringBuffer的reverse()

        //创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();

        //添加功能
        sb.append("hello").append("world").append("java");
        System.out.println("sb:"+sb);

        //反转功能 public StringBuffer reverse():
        sb.reverse();
        System.out.println("sb:"+sb);

    }
}
