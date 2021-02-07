package com.rwkj.demo.xiancheng;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 1、synchronized和lock的区别
 * sunchronized 是Java的關鍵字，属于ivm层面，可重入鎖
 * monitorenter   monitorexit
 * lock是具体的类是API层面的锁
 * <p>
 * 使用方法
 * synchronized 不需要用戶去手動釋放鎖，当synchronized代码执行后系统会自动让现场释放对锁的占用
 * reentrantlock则小樱桃用户器手动释放锁若没有主动是否所，就有可能导致出现死锁想现象。
 * 需要lock（）和unlock（）方法配合使用try、finally来完成
 * <p>
 * 3 等待释放可中断
 * synchronized没有
 * reentrantlock可以中断。
 * <p>
 * 4 公平锁
 * synchronized飞公平锁
 * reentrantlock两者都可以。默认公平锁，构造方法传入boolean值，true为公平锁，false为非公平锁。
 * 5 绑定多个条件 condition
 * reentrantlock用来使用分组唤醒需要唤醒的线程们，可以精确唤醒，而不是synchronized需要随机唤醒一个线程要么唤醒全部唤醒
 */

/**
 * 多线程之间属性调用，实现A-B-C三个线程自动，如下
 * AA打印5此，BB打印10此，CC打印15次
 * 接着
 * AA打印5此，BB打印10此，CC打印15次
 *
 * ---- 10轮
 *
 * Ctrl+Alt+L整理代码
 * ctrl+ alt+T调出try
 * ctrl+ alt+F选中翻译
 */

class ShareResource {
    private int number = 1;
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    //1判斷
    public void print5() {
        lock.lock();
        try {
            while (number != 1) {
                c1.await();
            }
            //2干活
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            //3通知
            number = 2;
            c2.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print10() {
        lock.lock();

        try {
            while (number != 2) {
                c2.await();
            }
            //2干活
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            //3通知
            number = 3;
            c3.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print15() {
        lock.lock();

        try {
            while (number != 3) {
                c3.await();
            }
            //2干活
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            //3通知
            number = 1;
            c1.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


}

public class SyncAndRentrantLockDemo {
    public static void main(String[] args) {
        ShareResource shareResource = new ShareResource();

        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                shareResource.print5();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                shareResource.print10();
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                shareResource.print15();
            }
        }, "C").start();

    }
}
