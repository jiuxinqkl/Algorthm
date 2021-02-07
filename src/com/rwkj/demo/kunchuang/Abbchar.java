package com.rwkj.demo.kunchuang;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//功能描述：查找一个字符串的子字符串集
//
//    输入：abab
//
//    输出：a b ab ba aba bab
public class Abbchar {
    public static void main(String[] args) {
        System.out.println(getChildren("ababc"));
    }
    public static List<String> getChildren(String data) {
        Set<String> set = new TreeSet<String>();
        for (int i = 1; i < data.length(); i++) {
            for (int j = 0; j < data.length(); j++) {
                if (j + i <= data.length()) {
                    set.add(data.substring(j, j + i));
                }
            }
        }
        List<String> list = new ArrayList<String>();
        list.addAll(set);
        return list;
    }
}
