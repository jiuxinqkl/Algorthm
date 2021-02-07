package com.rwkj.demo.kunchuang;

public class HuiWenShu {
    public static boolean palindrom(Integer integer) {
        String str1 = String.valueOf(integer);
        String str2 = new StringBuilder(str1).reverse().toString();
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        System.out.println(palindrom(1232)); }}
