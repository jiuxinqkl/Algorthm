package com.rwkj.demo.emnum;

import java.util.ArrayList;

public class AnnotationTest {

    //Overread
    //Suppresswarning 警告
    /**
     * 如何自定义注解
     */
    //元数据的理解:对现有数据的修饰
    String name = "jiuxin";
    //元注解对现有的注解进行修饰的注解
    /*
    Retention
    Target 用于指定被修饰的annotation 能用于修饰的那些程序元素
    Documented 表示所修饰的注解在被Javadoc解析时，保留下来
    Inherited 具有继承性
     */

    /**
     * jdk8.0 中注解额新特性，可重复注解，类型注解
     *  1、重复定义多个
     *  在类上面声明注解@Repeatable(myAnnation.class)
     *
     */

}
//类型注解框架中都是基于注解的
class Generic<T>{
   ArrayList<String> list= new ArrayList<>();
}
