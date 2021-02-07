package com.rwkj.demo.generic;

import org.junit.Test;
import org.omg.PortableServer.ForwardRequest;

import java.util.*;
//泛型
public class GenericTest {

    @Test
    public void test1(){
      ArrayList list= new ArrayList();
      list.add(78);
      list.add(76);
      list.add(89);
      list.add(88);
    //  list.add("tom");
       //ClassCastException类型转换异常
      for (Object score:list){
          int stuScore= (int) score;
          System.out.println(stuScore);
      }
    }

    //在集合中使用泛型的情况
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<>();
       list.add(22);
       list.add(22);
       list.add(22);
       list.add(22);
       list.add(22);
        //快熟生成 iter
        for (Integer integer : list) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }

    //z在集合中使用泛型的情况，以HashMap为例
    @Test
    public void test3(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a",90);
        map.put("b",89);
       Set<Map.Entry<String,Integer>> entry =map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
         while (iterator.hasNext()){
             Map.Entry<String, Integer> e = iterator.next();
             String key = e.getKey();
             Integer value = e.getValue();
             System.out.println(key  +"---------------->"+value);
         }

    }
}
