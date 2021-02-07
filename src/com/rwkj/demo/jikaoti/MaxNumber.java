package com.rwkj.demo.jikaoti;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 手动输入一个存储整数的数组，要求输出数组里面的2个最大值
 */
public class MaxNumber {
    public static void main(String[] args) {
        int len = 4;
        int[] ary = new int[len];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ary.length; i++) {
            System.out.print("请输入数组第＂+（i+1）+＂个整数：");
            ary[i] = sc.nextInt();
        }
        System.out.println("控制台写入的值" + Arrays.toString(ary));
        for (int j = 0; j < ary.length - 1; j++) {
            for (int k = j + 1; k > 0; k--) {
                if (ary[k] > ary[k - 1]) {
                    int temp = ary[k - 1];
                    ary[k - 1] = ary[k];
                    ary[k] = temp;
                }
            }
        }
        System.out.println("两个最大值为" + ary[0] + "*" + ary[1]);
    }
}
