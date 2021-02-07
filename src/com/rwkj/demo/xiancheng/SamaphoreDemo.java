package com.rwkj.demo.xiancheng;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
//模擬搶車為
public class SamaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);//模拟三个车位
        for (int i = 1; i <=6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "\tqingcheweichangdpa");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(Thread.currentThread().getName() + "\tqingchewe--------------i");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            }, String.valueOf(i)).start();
        }
    }
}
