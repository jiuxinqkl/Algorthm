package com.rwkj.demo.jikaoti;

import java.util.*;
/*
删除一个字符串里出现次数最多的子字符串,如果有多个出现次数相同的并且出现次数最多则将多个全部删除

比如abbccd

得到结果 ad
 */
public class DelMostAlike {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        loay("abcceedwe", m);
    }

    public static String loay(String coay, Map<String, Integer> m) {
        String[] apl = coay.split("");
        System.out.println(Arrays.toString(apl));
        List<String> l = new ArrayList<>();
        for (int i = 0; i < apl.length; i++) {
            l.add(apl[i]);
            if (m.get(apl[i]) == null) {
                m.put(apl[i], 0);
            }

            if (m.get(apl[i]) != null) {
                m.put(apl[i], (m.get(apl[i]) + 1));
            }
        }
        Integer is = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> it : m.entrySet()) {
            if (it.getValue() > is) {
                is = it.getValue();
            }
        }
        for (Map.Entry<String, Integer> it : m.entrySet()) {
            if (it.getValue().equals(is)) {
                sb.append(it.getKey());
            }
        }
        java.lang.String[] a = sb.toString().split("");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            for (int j = l.size() - 1; j > 0; j--) {
                if (a[i].equals(l.get(j))) {
                    l.remove(j);
                }
            }
        }
        System.out.println(l);
        return l.toString();
    }
}
