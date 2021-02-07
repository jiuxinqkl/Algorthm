package com.rwkj.demo.kunchuang;

public class Zip {
    public static void main(String[] args) {
        String s =  comp("aaaawwwwe");
        System.out.println(s);
    }
    public static String comp(String str){
        int i = 1;
        StringBuilder buf = new StringBuilder();
        int count = 1;
        char ch = str.charAt(0);
        for(;;){
            char c = i==str.length() ? '\10':str.charAt(i);
            if(c==ch){
                count++;
            }else{
                //  if(count == 1)
                //      buf.append(ch);
                //   else
                buf.append(count).append(ch);
                count=1;
                ch = c;
            }
            i++;
            if(i==str.length()+1){
                break;
            }
        }
        return buf.toString();

    }
}
