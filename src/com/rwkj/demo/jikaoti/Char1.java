package com.rwkj.demo.jikaoti;

import java.util.HashMap;
import java.util.Map;
public class Char1 {
    public static void main(String[] args) {
        String str = "aaaabbc中国1512";
        int digitCount=0;
        int engishCount=0;
        int chineseCount=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch >='0'&& ch<='9') {
                digitCount++;
            }else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))  {
                engishCount++;
            }else {
                chineseCount++;
            }
        }
        System.out.println("--------------"+digitCount);
        System.out.println("--------------"+engishCount);
        System.out.println("--------------"+chineseCount);
        System.out.println("--------------");
    }

}

