package com.rwkj.demo.xiancheng;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareData{
    private int number =0;
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();

    public void incremeny() throws Exception{
        //1panduan
        lock.lock();
        try {
            while(number !=0){
                //等待 不能生产
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName()+"\t"+number);
            //通知喚醒
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void decremeny() throws Exception{
        //1panduan
        lock.lock();
        try {
            while(number ==0){
                //等待 不能生产
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName()+"\t"+number);
            //通知喚醒
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}



/**
 * 一个初始值为零的变量，两个线程对其假体操作，一个加一个减，来5轮
 */
public class ProdConsumer_TraditionDemo {
    public static void main(String[] args) {
        ShareData shareData=new ShareData();
        new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                try {
                    shareData.incremeny();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"AA").start();

        new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                try {
                    shareData.decremeny();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        },"BB").start();
    }
}


