package com.rwkj.demo.jikaoti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 *  6、从类似如下的文本文件中读取出所有的姓名，并打印出重复的姓名和重复的次数，并按重复次数排序：
 * 1,张三,28
 * 2,李四,35
 * 3,张三,28
 * 4,王五,35
 * 5,张三,28
 * 6,李四,35
 * 7,赵六,28
 * 8,田七,35
 * 程序代码如下（答题要博得用人单位的喜欢，包名用该公司，面试前就提前查好该公司
 * 的网址，如果查不到，现场问也是可以的。还要加上实现思路的注释）：
 */
public class GetNameTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //InputStream ips =
        GetNameTest.class.getResourceAsStream("com/rwkj/demo/jikaoti/info.txt");
        //用上一行注释的代码和下一行的代码都可以，因为info.txt与GetNameTest类在
        // 同一包下面，所以，可以用下面的相对路径形式

        Map results = new HashMap();
        InputStream ips = GetNameTest.class.getResourceAsStream("info.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(ips));
        String line = null;
        try {
            while((line=in.readLine())!=null)
            {
                dealLine(line,results);
            }
            sortResults(results);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static class User
    {
        public String name;
        public Integer value;
        public User(String name,Integer value)
        {
            this.name = name;
            this.value = value;
        }
        @Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub

            //下面的代码没有执行，说明往treeset中增加数据时，不会使用到equals方法。
            boolean result = super.equals(obj);
            System.out.println(result);
            return result;
        }
    }

    private static void sortResults(Map results) {
        // TODO Auto-generated method stub
        TreeSet sortedResults = new TreeSet(new Comparator(){
          public int compare(Object o1, Object o2) {
                        // TODO Auto-generated method stub
                        User user1 = (User)o1;
                        User user2 = (User)o2;
         /*如果compareTo返回结果0，则认为两个对象相等，新的对象不
        会增加到集合中去
         * 所以，不能直接用下面的代码，否则，那些个数相同的其他姓
        名就打印不出来。
         * */
                        if(user1.value < user2.value) {
                            return -1;
                        }else if(user1.value>user2.value){
                            return 1;
                        }else {
                            return user1.name.compareTo(user2.name);
                        }
                    }

                }
        );
        Iterator iterator = results.keySet().iterator();
        while(iterator.hasNext())
        {
            String name = (String)iterator.next();
            Integer value = (Integer)results.get(name);
           if(value > 1) {
                sortedResults.add(new User(name,value));
            }
        }

        printResults(sortedResults);
    }
    private static void printResults(TreeSet sortedResults)
    {
        Iterator iterator = sortedResults.iterator();
        while(iterator.hasNext())
        {
            User user = (User)iterator.next();
            System.out.println(user.name + ":" + user.value);
        }
    }
    public static void dealLine(String line,Map map) {
        System.out.println(line);
        if(!"".equals(line.trim()))
        {

            String [] results = line.split(",");
            if(results.length == 3)
            {
                String name = results[1];
                Integer value = (Integer)map.get(name);
                if(value == null) value = 0;
                map.put(name,value + 1);
            }
        }
    }
}

