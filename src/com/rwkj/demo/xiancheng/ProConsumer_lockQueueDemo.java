package com.rwkj.demo.xiancheng;


import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1、使用equals( )方法比较两个字符串是否相等。它具有如下的一般形式：
 *
 * boolean equals(Object str)
 *
 * 这里str是一个用来与调用字符串（String）对象做比较的字符串（String）对象。如果两个字符串具有相同的字符和长度，它返回true，否则返回false。这种比较是区分大小写的。
 *
 * 2、为了执行忽略大小写的比较，可以调用equalsIgnoreCase( )方法。当比较两个字符串时，它会认为A-Z和a-z是一样的。其一般形式如下：
 *
 * boolean equalsIgnoreCase(String str)
 */
class MyResouce{
    private volatile boolean FLAG =true;//默认开启 进行生产和消费
    private AtomicInteger atomicInteger=new AtomicInteger();
    //通顺适配和通用 传接口
    BlockingQueue<String> blockingQueue = null;
    public MyResouce(BlockingQueue<String> blockingQueue){
       this.blockingQueue=blockingQueue;
        System.out.println(blockingQueue.getClass().getName());
    }
    public void myProd() throws Exception {
        String data=null;
        boolean reValue;
       while(FLAG){
          data= atomicInteger.incrementAndGet()+"";
          reValue= blockingQueue.offer(data,2L,TimeUnit.SECONDS);
          if(reValue){
              System.out.println(Thread.currentThread().getName()+"\t 插入队列" +data+"成功");
          }else{
              System.out.println(Thread.currentThread().getName()+"\t 插入队列" +data+"失败");
          }
          TimeUnit.SECONDS.sleep(1);
       }
        System.out.println(Thread.currentThread().getName()+"\t 已经叫停");
    }
    public void myConsumer()throws Exception{
        String result =null;
        while(FLAG){
             result = blockingQueue.poll(2L,TimeUnit.SECONDS);
             if(null==result || result.equalsIgnoreCase("")){
                 FLAG=false;
                 System.out.println(Thread.currentThread().getName()+"\t 超过两秒没有取到退出消费");
                  return;
             }
             System.out.println(Thread.currentThread().getName()+"\t 消費队列" +result+"成功");
        }
    }

    public void stop()throws Exception{
        FLAG=false;
    }
}

/**
 * volatile/CAs/atomicInterger/BlcokQueue
 */
public class ProConsumer_lockQueueDemo {
    public static void main(String[] args) throws Exception {
        MyResouce myResouce = new MyResouce(new ArrayBlockingQueue<>(10));
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t 生产线程启动");
            try {
                myResouce.myProd();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"prod").start();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t 消費启动");
            try {
                myResouce.myConsumer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"Consumer").start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("时间到停止生产消费");
        myResouce.stop();
    }
}
