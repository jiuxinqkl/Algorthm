package com.rwkj.demo.kunchuang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//请编写程序，完成键盘录入学生信息，并计算总分将学生信息与总分一同写入文本文件。
//需求：键盘录入 3 个学生信息（姓名，语文成绩，数学成绩）；
//求出每个学生的总分；
//并且将学生的信息写入 Student.txt 文件中。
//要求文件中的效果下所示：
//姓名 语文成绩 数学成绩 总分
//李四 99 88 187
//张三 20 90 110
//王五 100 100 200

class Student {
    // 姓名,语文成绩,数学成绩,总分
    private String name;
    private int chinese;
    private int math;
    private int total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

public class Test1 {
    public static void main(String[] args) throws IOException {
        //1： 键盘输入数据， 把数据封装成学生对象， 存储到集合中
        //2:创建学生集合
        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            //键盘输入数据
            System.out.println("请输入学生姓名：");
            String name = sc.nextLine();
            System.out.println("请输入语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("请输入数学成绩：");
            int math = sc.nextInt();
            //把数据封装成学生对象
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setTotal(math + chinese);
            //存储到集合中
            students.add(s);
        }
        //3： 目的地  Student.txt
        File destPath = new File("Student.txt");
        // 获取集合中的每一个Student对象
        BufferedWriter bw = new BufferedWriter(new FileWriter(destPath));
        bw.write("学生姓名\t");
        bw.write("语文成绩\t");
        bw.write("数学成绩\t");
        bw.write("总分\t");
        bw.newLine();
        bw.flush();
//newLine()是换行
//readLine()是读取一行数据
//nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
//
//next（）会自动消去有效字符前的空格，只返回输入的字符，不能得到带空格的字符串。
        for (Student s : students) {
            //6: 把 Student信息 存储到文本文件中
            //数据源  -- Student s
            //目的地  -- Student.txt
            String name = s.getName();
            int chinese = s.getChinese();
            int math = s.getMath();
            int total = s.getTotal();

            bw.write(name + "\t");
            bw.write(chinese + "\t");
            bw.write(math + "\t");
            bw.write(total + "\t");
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
    }


}

