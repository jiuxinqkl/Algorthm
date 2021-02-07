package com.rwkj.demo.kunchuang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//试题1:字符子串拆分
//描述:
//给定两个字符串a和b，定义a*b标识两个字符串的链接。
//例如：a=”abc”,b=”def”,则a*b=”abcdef”。
//如果将连接看成乘法，则按照普遍的方法，一个非负整数的幂表示为：
//a的0次方：a^0=””
//a的1次方：a^1=a
//a的2次方：a^2=a*a
//……
//a的n+1次方：a^(n+1)=a*(a^n)。
//
//输入：
//字符串s，长度在1~100之间。
//输出：
//每个字符串s，输出最大的n和对应的a，使其满足s=a^n。
//例如：
//s=”abcd”,则n=1, a=”abcd”
//s=”aaaa”,则n=4，a=”a”
//s=”ababab”,则n=3，a=”ab”
//题目类别: 字符串,搜索
//难度: 中级
//分数:
//运行时间限制: 无限制
//内存限制: 无限制
//阶段: 应聘考试
//输入:
//字符串s，长度在1~100之间。
//
//输出:
//每个字符串s，输出最大的n和对应的a，使其满足s=an。
//例如：
//s=”abcd”,则n=1, a=”abcd”
//s=”aaaa”,则n=4，a=”a”
//s=”ababab”,则n=3，a=”ab”
//
//样例输入:
//ababab
//样例输出:
//3 ab

public class TestSplit {
    public static void main(String[] args) {

        while (true) {
          //  System.out.println("请输入");
            Scanner scn = new Scanner(System.in);
            String input = scn.next();
            int len = input.length();
            if(len<=0){
                System.out.println("error");
                continue;
            }
            List<Integer> list =  comDivisor(len);

            if (list.size() == 1) {
                System.out.println(list.get(0) + " " + input);
                continue;
            }

            for (int i = 0; i < list.size(); i++) {
                int count = list.get(i);
                boolean flag = false;
                for (int j = 0; j < len / count - 1; ) {
                    String a = input.substring(j * count, (j + 1) * count);
                    String b = input.substring((j + 1) * count, (j + 2) * count);
                    if (a.equals(b)) {
                        flag = true;
                        j += count;
                    } else {
                        flag = false;
                        j += count;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(len / count + " " + input.substring(0, count));
                    break;
                }
            }
        }
    }

    public static List<Integer> comDivisor(int num) {
        List<Integer> lists = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                lists.add(i);
            }
        }
        return lists;
    }
}
