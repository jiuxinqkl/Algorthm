package com.jiuxin.mishi.bishiti;
//3. 用递归求N!=N*(N-1)*(N-2)*...*2*1;
public class Foctori {

    public static void main(String[] args) {
        Foctori.digui(5);
    }
    public static int digui(int i){
        if(i==0||i==1) {
            return 1;
        } else {
            return i*digui(i-1);
        }

    }

}
