package com.rwkj.demo.singeton;
//一般用于枚举法：
enum Single {
    Single;
    private Single() { }
    public void print(){
        System.out.println("hello world");
    }
}
public class SingleDemo {
    public static void main(String[] args) {
        Single a = Single.Single;
        a.print();
    }
}