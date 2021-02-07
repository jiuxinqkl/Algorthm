package com.rwkj.demo.kunchuang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintArray {
        public static void main(String[] args) {
            List<String> list = new ArrayList<String>();
            list.add("First");
            list.add("Second");
            list.add("Third");
            list.add("Fourth");


            System.out.println(list);


            String[] array = new String[] { "First", "Second", "Third", "Fourth" };
            System.out.println(array.toString());
            System.out.println(Arrays.toString(array));


            String[] arr1 = new String[] { "Fifth", "Sixth" };
            String[] arr2 = new String[] { "Seventh", "Eigth" };
            String[][] arrayOfArray = new String[][] { arr1, arr2 };


            System.out.println(arrayOfArray);
            System.out.println(Arrays.toString(arrayOfArray));
            System.out.println(Arrays.deepToString(arrayOfArray));
        }

        //Arrays.deepToString()与Arrays.toString()的区别
    //Arrays.deepToString()主要用于数组中还有数组的情况，而Arrays.toString()则相反，对于Arrays.toString()而言，当数组中有数组时，不会打印出数组中的内容，只会以地址的形式打印出来。
}
