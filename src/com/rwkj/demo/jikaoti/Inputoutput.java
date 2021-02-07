package com.rwkj.demo.jikaoti;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Inputoutput {
    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
     //  Scanner cin = new Scanner(System.in); //加 Buffer 速度会快一些
/*
        读一个整数：int n = cin.nextInt();
        相当于scanf("%d", &n); 或 cin >> n;
        读一个字符串：String s = cin.next();
        相当于scanf("%s", s); 或 cin >> s;
        读一个浮点数：double t = cin.nextDouble();
        相当于scanf("%lf", &t); 或 cin >> t;
        读一整行：String s = cin.nextLine();
        相当于gets(s); 或 cin.getline(...);
        判断是否有下一个输入：可以用cin.hasNext() 或 cin.hasNextInt() 或 cin.hasNextDouble() 。
        // 这里 0 指一位数字，# 指除 0 以外的数字（用来省略末尾的0）
        DecimalFormat f = new DecimalFormat("#.00#");
        DecimalFormat g = new DecimalFormat("0.000");
        double a = 123.45678, b = 0.12;
        System.out.println(f.format(a));
        System.out.println(f.format(b));
        System.out.println(g.format(b));
(import java.math.*) // 需要引入 java.math 包
BigInteger a = BigInteger.valueOf(100);
BigInteger b = BigInteger.valueOf(50);
BigInteger c = a.add(b) // c = a + b;
主要有以下方法可以使用：
↓CloseCode↓BigInteger add(BigInteger other)
BigInteger subtract(BigInteger other)
BigInteger multiply(BigInteger other)
BigInteger divide(BigInteger other)
BigInteger mod(BigInteger other)
int compareTo(BigInteger other)
static BigInteger valueOf(long x)
//输出大数字时直接使用 System.out.println(a) 即可。

int[] a = new int[10];  //声明数组的同时分配内存
遍历数组
例如：
↓CloseCode↓//一维数组
String[] str = new String[3];
str[0]="张三";
str[1]="李四";
str[2]="王五";
// for形式遍历数组
for(int i=0;i<str.length;i++) {
    System.out.println("一维数组:for:"+str[i]);
}

int[] ints={1,4,7,2,5,8,3,6,9};
全体升序
Array.sort(int[] a)：直接对数组进行升序排序
例如：
System.out.println("升序排序：");
Arrays.sort(score);
System.out.println(Arrays.toString(score)); //这里我偷了个懒。。把他变成字符串输出了
Comparator接口可以实现自定义排序，实现Comparator接口时，要重写compare方法：
int compare(Object o1, Object o2)返回一个基本类型的整型。

如果要按照升序排序，则

o1小于o2，返回-1（负数）
相等，返回0
o1大于o2，返回1（正数）

如果要按照降序排序，则

o1小于o2，返回1（正数）
相等，返回0
o1大于o2，返回-1（负数）


看到这里，可能有人就懵了，凭什么升序是这样安排的，降序是那样安排的呢？？

System.out.println("\n降序排序：");
//要实现降序排序，得通过包装类型数组，基本类型数组是不行的
Integer[] integers = {1,4,7,2,5,8,3,6,9};
Arrays.sort(integers, new Comparator<Integer>()
{
    public int compare(Integer o1, Integer o2)
    {
//      if(o1 < o2) {
//          return 1;
//      }else if(o1 > o2) {
//          return -1;
//      }else {
//          return 0;
//      }

        return o2-o1;   //与“小于取正，等于取0，大于取负”相同效果
    }
});

//输出
for (Integer integer:integers)


*/

    }
}
