package com.rwkj.demo.singeton;

public class SingleTon3{
    //下面是该类自身的业务功能代码
    private int count = 0;
  //  public synchronized int getSequence(){
  //    ++count;
 //  }

    //下面是把该类变成单例的代码
     private SingleTon3(){};
    private final static SingleTon3 instance = new SingleTon3();
    public static SingleTon3 getInstance(){
        return instance;
    }

}