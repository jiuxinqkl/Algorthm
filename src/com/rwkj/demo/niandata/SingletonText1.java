package com.rwkj.demo.niandata;

/**
 * 单例设计模式
 */
public class SingletonText1 {
    Bank bank=Bank.getInstance();

}
//饿汉式
class Bank{
    //私有化构造器
    private Bank(){
    }

    //内部创建类的对象
    private static Bank instance =new  Bank();

    //提供公共的静态方法，返回类的对戏
    public static Bank getInstance(){
        return instance;
    }
}