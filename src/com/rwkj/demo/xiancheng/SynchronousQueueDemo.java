package com.rwkj.demo.xiancheng;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * 同步队列
 */
public class SynchronousQueueDemo {
    public static void main(String[] args) throws InterruptedException {
      BlockingQueue<String> blockingDeque = new SynchronousQueue<>();
      new Thread(()->{
          try {
              System.out.println(Thread.currentThread().getName()+"\t put 1");
              blockingDeque.put("1");
              System.out.println(Thread.currentThread().getName()+"\t put 2");
              blockingDeque.put("2");
              System.out.println(Thread.currentThread().getName()+"\t put 3");
              blockingDeque.put("3");

          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      },"aaa").start();

        new Thread(()->{
            try {
                //Ctrl+Alt+T 快捷键
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"\t"+blockingDeque.take());
              //  blockingDeque.take();
                try {
                    TimeUnit.SECONDS.sleep(5);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"\t"+blockingDeque.take());

                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"\t"+blockingDeque.take());


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"bbb").start();
    }
}
