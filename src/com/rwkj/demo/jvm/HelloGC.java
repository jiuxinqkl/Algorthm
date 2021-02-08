package com.rwkj.demo.jvm;

public class HelloGC {
    public static void main(String[] args) {
        long totalMemory = Runtime.getRuntime().totalMemory(); //返回Java虚拟机中的内存总量是多少
        long maxMemory = Runtime.getRuntime().maxMemory();   //最大内存兩

        System.out.println("totalMemory(-Xms)="+totalMemory+"(字节)、"+(totalMemory/(double)1024/1024)+"MB");

        System.out.println("MAX-MEMORY(-Xmx)="+maxMemory+"(字节)、"+(maxMemory/(double)1024/1024)+"MB");
    }
}
//jps -l
//jinfo flag
