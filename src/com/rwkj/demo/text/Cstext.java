package com.rwkj.demo.text;
//传值
public class Cstext {

        public static void swap( int x,  int y) {
            int temp = x;
            x = y;
            y = temp;
        }

        public static void main(String[] args) {
            int a = 5, b = 10;
            swap ( a,  b);
           //  a = 10; b = 5;
            System.out.println("a = {0}, b = {1}"+a+"---"+b);
        }


}
