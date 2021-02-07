package com.rwkj.demo.jikaoti;
//recursion递归

import javax.xml.transform.Result;

/**
 * 一个整数，大于 0，不用循环和本地变量，按照 n，2n，4n，8n 的顺序递增，当
 * 值大于 5000 时，把值按照指定顺序输出来。
 * 例：n=1237
 * 则输出为：
 * 1237，
 * 2474，
 * 4948，
 * 9896，
 * 9896，
 * 4948，
 * 2474，
 * 1237，
 * 提示：写程序时，先致谢按递增方式的代码，写好递增的以后，再增加考虑递减
 */
public class Recursion {

    public static void doubleNum(int n)
    {
        System.out.println(n);
        if(n<=5000)
            doubleNum(n*2);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Recursion recursion=new Recursion();
        recursion.doubleNum(234);
    }
}
