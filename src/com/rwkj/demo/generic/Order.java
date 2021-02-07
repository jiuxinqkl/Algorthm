package com.rwkj.demo.generic;

import java.util.ArrayList;
import java.util.List;

public class Order<T> {
    String orderName;
    int ordeId;

    //类的内部结构就可以使用类的泛型
    T orderT;

    public Order(){

      //  T[] arr= (T[]) new Object[10];

    };
    public Order(String otderName,int orderId,T orderT){
        this.orderName=otderName;
        this.ordeId=orderId;
        this.orderT=orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", ordeId=" + ordeId +
                ", orderT=" + orderT +
                '}';
    }

    //静态方法中不能使用泛型
    //异常类不能声明为泛型类
   //泛型方法：在方法中出现了泛型的结构，泛型参数与类的放心参数没有任何关系
    //泛型方法所属的类是不是泛型类都没有关系
    //在前面加个<E>
    public <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for (E e : list) {
            list.add(e);
        }
        return list;
    }
}
