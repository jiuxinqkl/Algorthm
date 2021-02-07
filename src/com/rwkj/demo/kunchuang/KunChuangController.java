package com.rwkj.demo.kunchuang;

import javax.xml.transform.Result;
import java.awt.*;
import java.util.Scanner;

//字符阿窗壓縮整理
public class KunChuangController {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuffer result = new StringBuffer();
        // 字符串长度
        int count = str.length();
        // 取第一个字符
        char word1 = str.charAt(0);
        // 连续字符的个数
        int sum = 1;
        for (int i = 1; i < count; i++) {
            // 循环取字符
            char word2 = str.charAt(i);
            // 把前一个字符和当前字符比较
            if (word1 == word2) {
                // 相同的字符 个数加1
                sum++;
                continue;
            }
            // 拼接字符
            result.append(sum).append(word1);
            // 当前字符变为前一个字符
            word1 = word2;
            // 个数清零
            sum = 1;
        }

        System.out.println("字符串压缩后:" + result.append(sum).append(word1));
    }
}

//代码对齐快捷键：ctrl  +  alt  +  L

