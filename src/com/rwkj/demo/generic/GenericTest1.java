package com.rwkj.demo.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义泛型结构，泛型类，泛型接口，泛型方法
 */
public class GenericTest1 {

    @Test
    public void test1(){
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("333");

        Order<String> order1 = new Order<String>("orderAA",2,"222");
        order1.setOrderT("AA:hello");
    }

   @Test
    public void test2(){
        SubOrder order=new SubOrder();
        order.setOrderT(888);

       SubOrder1<String> subOrder1 = new SubOrder1<>();
        subOrder1.setOrderT("222");
   }

   @Test
   public void test4(){
       Order<String> order = new Order<>();
       Integer[] arr = new Integer[]{1, 2, 3, 4};
       //泛型方法在调用的时候确定。
       List<Integer> list = order.copyFromArrayToList(arr);
       System.out.println(list);
    }

    /*
    通配符？
       //添加，对于List<?>就不能像其内部添加数据 除了添加null之外。
      //  list.add(null);
     */
    @Test
    public void test3(){
        List<Object> list1=null;

        List<?> list = null;
        list=list1;
        List<String> list3=new ArrayList<>();
        list3.add("2343");
        list3.add("BB");
        list=list3;
        list.add(null);

        Object o = list.get(0);
        System.out.println(o);

    }

    /*
    <? extends A>
     */




}
