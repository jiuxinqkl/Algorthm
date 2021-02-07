package com.rwkj.demo.kunchuang;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
//public int nextInt(int n)
//
//该方法的作用是生成一个随机的int值，该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n。
public class GenerateNum {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String str = "";
        int temp = 0;
        while (str.length() != 4) {
            temp = random.nextInt(10);//随机获取0~9的数字
            System.out.println(temp);
            System.out.println("------------");
            if (arr[temp] == 0) {
                str += temp;
                arr[temp] = 1;
            }
        }

        System.out.println(str);

        System.out.println(Arrays.toString(arr));
//////////////////下一中////////////////////////////
        int i = generateNumber();
        System.out.println(i);
    }

    private static int generateNumber() {
        Random rd = new Random();
        // 个位数字
        int nextInt = rd.nextInt(10);// 随机生成一个【0-10)的数字
        // 十位数字
        boolean flag = true;
        int shi = 0;
        while (flag) {
            shi = rd.nextInt(10);
            if (shi != nextInt) {
                flag = false;
            }
        }
        // 百位数字
        boolean flag1 = true;
        int bai = 0;
        while (flag1) {
            bai = rd.nextInt(10);
            if (bai != shi && bai != nextInt) {
                flag1 = false;
            }
        }
        // 千位数字
        boolean flag2 = true;
        int qian = 0;
        while (flag2) {
            qian = rd.nextInt(9) + 1;
            if (qian != bai && qian != bai && qian != nextInt && qian != shi) {
                flag2 = false;
            }
        }

        // 随机生成的四位数
        int number = nextInt + shi * 10 + bai * 100 + qian * 1000;
        return number;
    }
}
