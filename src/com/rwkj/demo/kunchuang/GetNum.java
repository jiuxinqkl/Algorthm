package com.rwkj.demo.kunchuang;

import java.util.ArrayList;
import java.util.List;

public class GetNum {

    private static final List<Integer> list = new ArrayList(10000);

    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            int num = (int) ( Math.random() * (10000 - 0 + 1));
            list.add(num);
        }
        list.sort(Integer::compareTo);
        System.out.println(list.indexOf(9999));
    }
}


//待思考