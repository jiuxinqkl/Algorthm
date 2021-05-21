package com.rwkj.demo.prime;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Text2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();    //取开始时间
        int num=0;
        int j;
        int n=100;
        List<Integer> list = new ArrayList<>();
        boolean sgin;
        for (int i = 2; i <= n; i++) {
            if(i % 2 == 0 && i != 2  )  continue; //偶数和1排除

            sgin= true;
            for (j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    sgin = false;
                    break;
                }
            }

            //打印
            if (sgin) {
                num++;
                 System.out.println(""+i);
                list.add(i);
            }
        }
        System.out.println(n+"以内的素数有"+num+"个");
        long end = System.currentTimeMillis();
        System.out.println("----------------list-------------->"+list);
        System.out.println("The time cost is " + (end - start));
        System.out.println("");
    }

}
