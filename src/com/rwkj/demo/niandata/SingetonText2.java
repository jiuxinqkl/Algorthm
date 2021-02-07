package com.rwkj.demo.niandata;

import java.awt.*;

/**
 * 单例设计模式懒汉式
 * 懒汉式与饿汉式的区别：
 * 饿汉式：对象加载时间过长，间接反映static的关键字，生命周期过长
 *      好处：线程安全
 * 懒汉式：延迟创建对象 ，节省内存空间
 *      目前的写法：线程不安全。
 *      abstract 可以修饰的结构：类方法
 *      finale 可以修饰类方法，
 *      static 静态
 *      abstract 抽象的 修饰类：抽象类 抽象方法
 *      抽象类的子类，让子类对象实例化，完成相关的操作
 *      抽象方法只有方法的申明，没有方法体。
 *      类要是抽象类
 *      包含抽象方法的类一定是一个抽象类，反之 抽象类中不一定有抽象方法
 *      抽象类不能实例化。
 *
 */
public class SingetonText2 {
    long start =System.currentTimeMillis();
    long end  =System.currentTimeMillis();
}

class Order{
    //私有化类的构造器
    private Order(){

    }
    //声明当前类的对象，没有初始化
    private static Order instance=null;

    public static  Order getInstance(){
        if (instance==null){
            instance =new Order();
        }
        return instance;
    }
}