package com.rwkj.demo.javaStream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * stream关注的是对书记的晕眩，与Course打交道
 * 集合关注的是书记的存储，与内存打交道
 *
 * stream的实例化
 *
 *1、一个中间操作连，对数据源的数据进行处理
 *
 */
public class StreamAPITest {
    //通过集合创建
    @Test
    public void test1(){
        List<Employee> employees=EmployeeData.getEmployees();
       //顺序流
        Stream<Employee>  stram =employees.stream();
        System.out.println(stram);

        //并行刘
        Stream<Employee> employeeStream = employees.parallelStream();
        System.out.println(employeeStream);
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};
        Arrays.stream(arr);
        Employee e1 = new Employee(1001, "Tom");
        Employee e2 = new Employee(1002, "Tomjetty");
        Employee[] arr1 =new  Employee[]{e1, e2};
        Stream<Employee> stream1 = Arrays.stream(arr1);

    }

    //通过Stream的of（）；
    @Test
    public void test(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
    }
}
