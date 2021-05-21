package com.rwkj.demo.prime;

import java.util.ArrayList;
import java.util.List;

public class Text3 {

    public static void main(String[] args) {

        /*System.out.println(n+"以内的素数有"+num+"个");
        long end = System.currentTimeMillis();
        System.out.println("----------------list-------------->"+list);
        System.out.println("The time cost is " + (end - start));
        System.out.println("");*/

        //List shusu = Text3.Shusu(2, 100);
       // System.out.println("------------------>"+shusu);
        //Starting number
        System.out.println(Text3.Prime(2,100));
    }


    public static List Prime(int m, int n){

        ArrayList<Integer> list = new ArrayList<>();
        int num =0;
        int i;
        int j;
        boolean flag;
        for (i = m; i <= n ; i++) {
            if(i%2==0 && i !=2) continue;
            flag=true;
            for (j = m; j <= Math.sqrt(i); j++) {
                if(i % j==0){
                    flag =false;
                    break;
                }
            }
            if(flag){
                num ++;
                list.add(i);
            }

        }

        System.out.println("num的总数是"+num);
        return list;

    }

   /* public static List Shusu(int i,int j){
        int num=0;
        int n=200;
        List<Integer> list = new ArrayList<>();
        boolean sgin;
        for (i = i; i <= n; i++) {
            if(i % 2 == 0 && i != 2  )  continue; //偶数和1排除

            sgin= true;
            for (j = i; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    sgin = false;
                    break;
                }
            }

            //打印
            if (sgin) {
                num++;
               // System.out.println(""+i);
                list.add(i);
            }
        }
        return list;
    }*/
}
