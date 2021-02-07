package com.rwkj.demo.xiancheng;
/**
 * runabble 沒有給返回值
 * callbale有返回值
 *
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*class MyThread implements Runnable{
    @Override
    public void run() {

    }
}*/

class MyThread implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return 1024;
    }
}
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask =new FutureTask<>(new MyThread());
        Thread t1=new Thread(futureTask,"AA");
        t1.start();
        System.out.println("--------------------"+futureTask.get());
    }
}
