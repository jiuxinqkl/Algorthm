package com.rwkj.demo.utils;


public class DataUtil {
    public static void main(String[] args) {
        String Str1 = "abcdefg";

        StringBuffer Str2=new StringBuffer(Str1.substring(2, 6));
        System.out.println(Str2);
        System.out.println(Str2.reverse());
        System.out.println(Str1.substring(0, 2)+Str2.reverse()+Str1.substring(6));

        String S1 = "abkkcadkabkebfkabkskab";

////替换法 将字符串中ab替换为空,创建新的字符串

        String S2=S1.replace("ab","");

//两者之差为ab出现次数，因为ab各占一个索引，不除以2得到的次数为8次

        System.out.println("ab出现的次数为："+(S1.length()-S2.length())/2);
        System.out.println(S2);

    }
}
