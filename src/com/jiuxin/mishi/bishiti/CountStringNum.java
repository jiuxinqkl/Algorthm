package com.jiuxin.mishi.bishiti;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//5.  //统计字符串的个数 "I'm go to swimming"

/**
 *  关于Iterator主要有三个方法：hasNext()、next()、remove()
 *
 *   hasNext:没有指针下移操作，只是判断是否存在下一个元素
 *
 *   next：指针下移，返回该指针所指向的元素
 *
 *  remove：删除当前指针所指向的元素，一般和next方法一起用，这时候的作用就是删除next方法返回的元素
 */
public class CountStringNum {
    public static void main(String[] args) {
      String str =  "I'm go to swimming";
       Set<String> set =new HashSet<String>();
        for (int i = 0; i < str.length(); i++) {
           String s= str.substring(i,i+1);
           set.add(s);
        }
        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()) {
            String sr = (String) it.next();
            int k = 0;
            for (int j = 0; j < str.length(); j++) {
                if (sr.equals(str.substring(j, j + 1))) {
                    k++;
                }
            }
            System.out.println(sr + "有" + k + "个");
        }
    }

}


/*
5.  //统计字符串的个数 "I'm go to swimming"
        //      I:1		//	':1	//	m:3	//	空格：3	//	g:2//	...
        String str = "I'm go to swimming";
        Set<String> set = new HashSet<String>();
        for(int i=0;i<str.length();i++){
        String s = str.substring(i,i+1);
        set.add(s);
        }
        Iterator it = set.iterator();
        while(it.hasNext())
        {
        String sr =(String)it.next();
        int k=0;
        for(int j=0;j<str.length();j++){
        if(sr.equals(str.substring(j,j+1))){
        k++;
        }
        }
        System.out.println(s + "有" + k + "个");
        }*/
