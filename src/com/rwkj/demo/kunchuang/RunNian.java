package com.rwkj.demo.kunchuang;

public class RunNian {
    public static void main(String[] args) {
        for (int i = 1990; i <= 2010; i++)
        {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
            {
               // cout << i << endl;
                System.out.println(i);
            }
        }
      //  return 0;

            int n=10;
            int x = 1;
            //  System.out.scanf("%d",&n);
            for(int i = 1;i<=n;i++)
            {
                x *= i;
            }
            System.out.printf("%d",x);
           // return 0;

    }


}
