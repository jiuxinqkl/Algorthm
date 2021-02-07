package com.rwkj.demo.kunchuang;

import java.util.Scanner;

public class Convert {
    static void exitContinue(){

        while (true){
            System.out.print("你想继续吗？（y/n)");
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().toCharArray()[0];
            if (ch == 'n'){
                System.out.println("退出系统!");
                System.out.println("Process completed.");
                System.exit(-1);
            }
            else if(ch == 'y'){
                break;
            }
            else{
                System.out.println("输入错误，请重新输入：");
                continue;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("******欢迎使用学员状态转换器******");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("请输入学员状况的第一个英文字母：");
            String input = sc.next().toUpperCase();
            char opt = input.toCharArray()[0];

            switch(opt){
                case 'E':
                    System.out.println("优秀");
                    exitContinue();
                    break;
                case 'G':
                    System.out.println("良好");
                    exitContinue();
                    break;
                case 'S':
                    System.out.println("中等");
                    exitContinue();
                    break;
                case 'F':
                    System.out.println("不合格");
                    exitContinue();
                    break;
                default:
                    System.out.println("输入错误，无法转换！");
                    exitContinue();
                    break;
            }
        }
    }
}
