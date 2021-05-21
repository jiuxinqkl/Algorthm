package com.jiuxin.mishi.bishiti;

public class SingleTon {
    private SingleTon(){};
    private static SingleTon singleTon;
    public static SingleTon getInstance(){
        if(singleTon ==null){
            singleTon =new SingleTon();
        }
        return singleTon;
    }
}

/*
public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}*/

/*public class Singleton {
    private static Singleton instance;
    private Singleton (){}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}*/

/*public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}*/

/*
public class Singleton(
        private  volatile static Singleton singleton;
        private Singleton()();
        public static Singleton getinstence(){
            if(singleton ==null){
                synchronzied(Singleton.class ){
                    if(singleton ==null){
                        singleton=new Singleton();
                    }
                }
            }
            return singleton;
        }
)
*/
