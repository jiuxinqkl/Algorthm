package com.rwkj.demo.iosream;

import org.junit.Test;

import java.io.File;

/**
 * filr的使用
 * file 类的一个对象，Java.io //input output
 * file 类声明在java.io包下
 *
 */
public class FileTest {
    /**
     * 相对路径
     * 结对路径
     *  windows:\\
     *  unix :/
     */
    @Test
    public void test1(){
        File file = new File("hello.txt"); //相对于当前项目
     // File.separator
      //  File file1 = new File("D:\\file\\hello.txt");
        System.out.println(file);

        //构造器2
        File file3 = new File("D:\\file","java");
    }
}
