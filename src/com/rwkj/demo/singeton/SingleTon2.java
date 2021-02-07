package com.rwkj.demo.singeton;
//饿汉式
public class SingleTon2 {
    private SingleTon2(){}
    private static SingleTon2 instance=null;
    public static synchronized SingleTon2 getInstance(){
        if(instance==null){
            instance=new SingleTon2();
        }
            return instance;
    }

}
