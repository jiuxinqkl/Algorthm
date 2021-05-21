package com.jiuxin.mishi.bishiti;

/**
 * 使用StringBuilder 的reverse() 将字符串翻转
 *
 */
public class RevirceNum {

    /*public static void main(String[] args) {
        String s="ABCDEF";
        StringBuilder builder =new StringBuilder(s);
        String s1 = builder.reverse().toString();
        System.out.println(s1);
    }*/

    public static void main(String[] args) {
        String s="ABCDEF";
       // RevirceNum.BuilderNum(s);
        RevirceNum.getString(s);

       // 不使用中间变量 把两个变量的值互换
        int a=10;
        int b=100;
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.print("a="+a+" b="+b);


        String str="this is a man";
        StringBuffer sb=new StringBuffer(str.length());
        for(int j = str.length()-1;j>=0;j--)
        {
            sb.append(str.charAt(j));
        }
        System.out.print(sb);
    }

    public static String BuilderNum(String s){

        StringBuilder builder =new StringBuilder(s);
        String s1 = builder.reverse().toString();
        System.out.println(s1);
        return s1;
    }


    public static String getString(String str){
        if(str.length()>0){
            String newStr = "";
            for(int i=0;i<str.length();i++)
            {
                char c = str.charAt(str.length()-1-i);
                newStr = newStr + c;
            }
            return newStr;
        }else{
            return null;
        }
    }

}

