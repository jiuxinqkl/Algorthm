package com.rwkj.demo.singeton;
//饱汉式
public class SingleTon1 {
    private SingleTon1(){};
    private final static SingleTon1 instance=new SingleTon1();
    public static SingleTon1 getInstance(){
        return instance;
    }
}
