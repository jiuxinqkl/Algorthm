package com.rwkj.demo.kunchuang;

import java.util.Arrays;

//1.功能描述：数组的循环移位，
//
//  输入：{a,b,c},2
//
//  输出：{b,c,a}
public class Xunhuan {

    public static void main(String[] args) {
        String[] sArr = getChildren(new String[] { "a", "b", "c", "A", "B", "C", "D", "E" }, 5);
        for (String s : sArr) {
          //  System.out.println(s);
        }
        System.out.println(Arrays.toString(sArr));

        //输入一个字符，将字符转换为小写，将其对应的ASCII值加5后，输出结果。
        //
        //   程序要求：若其值加5后的字符值大于'z',将其转换成从a开始的字符。
        //
        //   输入：‘A’
        //
        //   输出：‘f’
        String loay = "m";
        int c = loay.charAt(0);
        System.out.println(c);
        int num = c + 5;
        if (num > 'Z') {
            int a = 'a';
            System.out.println(a);
            int z = 'z';
            System.out.println((char) Character.toLowerCase(num + a - z - 1));
        } else {
            System.out.println((char) Character.toLowerCase(num));
        }


    }
    public static String[] getChildren(String[] data, int index) {
        for (int i = 0; i < index; i++) {
            int j = data.length - 1;
            String loay = data[j];
            for (j = data.length - 1; j > 0; j--) {
                data[j] = data[j - 1];
            }
            data[0] = loay;
        }
        return data;
    }


}
