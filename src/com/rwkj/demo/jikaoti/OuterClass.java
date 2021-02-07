package com.rwkj.demo.jikaoti;
//内部类的实现方式?
public class OuterClass {
    private class InterClass
    {
        public InterClass()
        {
            System.out.println("InterClass Create");
        }
    }
    public OuterClass()
    {
        InterClass ic = new InterClass();
        System.out.println("OuterClass Create");
    }
    public static void main(String[] args)
    {
        OuterClass oc = new OuterClass();
    }
}

/**
 * 执行结果InterClass Create
 * OuterClass Create
 */
