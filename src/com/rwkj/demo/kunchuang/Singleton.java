package com.rwkj.demo.kunchuang;

public class Singleton {
    private Singleton(){}
    //在自己内部定义自己一个实例，是不是很奇怪？
    //注意这是private 只供内部调用
    private static Singleton instance = new Singleton();
    //这里提供了一个供外部访问本class的静态方法，可以直接访问　　
    public static Singleton getInstance() {
        return instance;
    }


    /*public class Singleton {
 　　private static Singleton instance = null;
 　　public static synchronized Singleton getInstance() {
 　　//这个方法比上面有所改进，不用每次都进行生成对象，只是第一次　　　 　
 　　//使用时生成实例，提高了效率！
 　　if (instance==null)
 　　　　instance＝new Singleton();
            return instance; 　　}
    }*/
}
