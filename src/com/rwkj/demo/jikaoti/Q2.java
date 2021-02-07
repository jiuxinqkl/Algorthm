package com.rwkj.demo.jikaoti;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2.对输入字符串检查是否存在非法字符，输出合法字符串（去重），和非法字符串（不去重）
 * 对合法字符串循环左移10次，再进行排序输出。
 *
 * （1）字符串中的字符集和‘0’-‘9’，‘a’-‘z’，‘A’-‘Z’，其余为非法字符
 * （2）作为输入的字符串个数不超过100，每个字符串长度不超过64
 * （3）作为输入的连续空字符串(空格/制表符/回车/换行符)作为一个空格处理
 * （4）输入每行只有一个字符串
 * （5）输入以空格结束
 *
 * 输出：
 * （1）输出合法字符串并去重
 * （2）输出所有非法字符串
 * （3）对结果1的去重合法字符串循环左移10次
 * （4）对结果3合法字符串排序，按ASCII表字符从小到大顺序排序
 *
 * 每输出一个字符后用空格跟下一个字符串隔离，作为输出的所有字符串之间只能有一个空格
 *
 * 思路：使用正则表达式来匹配合法，非法字符。
 * */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp;
        final String end = "";
        final String space = " ";
        StringBuilder valid = new StringBuilder();
        StringBuilder inValid = new StringBuilder();
        StringBuilder afterLeft = new StringBuilder();
        ArrayList<StringBuilder> validList = new ArrayList<>();
        while(true) {
            temp = scanner.nextLine();
            if(temp.trim().equals(end)) {
                break;
            }
            if(isValid(temp)) {
                valid.append(temp);
                validList.add(new StringBuilder(temp));
                valid.append(space);
            } else {
                inValid.append(temp);
                inValid.append(space);
            }
        }
        scanner.close();
        for(int i = 0; i < validList.size(); i ++) {
            afterLeft.append(left(validList.get(i)));
            afterLeft.append(space);
        }
        System.out.println(valid.substring(0, valid.length() - 1));
        System.out.println(inValid.substring(0, inValid.length() - 1));
        System.out.println(afterLeft.substring(0, afterLeft.length() - 1));
    }
    static StringBuilder left(StringBuilder s) {
        int LEN = 10 % s.length();
        return new StringBuilder(s.substring(LEN)).append(s.substring(0, LEN));
    }
    static boolean isValid(String s) {
        for(int i = 0; i < s.length(); i ++) {
            if(!isValid(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    static boolean isValid(char c) {
        return c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }
}