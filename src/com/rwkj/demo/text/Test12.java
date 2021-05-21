package com.rwkj.demo.text;

import java.io.File;

public class Test12 {
    public static void main(String[] args) {
        File f = new File("/Users/Hao/Downloads");
        for(File temp : f.listFiles()) {
            if(temp.isFile()) {
                System.out.println(temp.getName());
            }
        }
    }

}
