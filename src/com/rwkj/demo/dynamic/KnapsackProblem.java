package com.rwkj.demo.dynamic;


public class KnapsackProblem {
    public static void main(String[] args) {
        
        int[] w={1,4,3};
        int[] val={1500,3000,2000};
        int m=4;
        int n=val.length;

        //未来记录放入商品的情况，我们定义一个二位数组
        int[][] path= new int[n+1][m+1];
        //创建二位数组
        int[][] v=new int[n+1][m+1];
        //初始化第一行和第一列
        for(int i=0;i<v.length;i++){
            v[i][0]=0;
        }
        for (int i = 0; i<v[0].length; i++) {
            v[0][i]=0;//将第一行设置为0
        }
        //根据前面得到的公式动态规划处理
        for (int i = 1; i <v.length ; i++) {
            for (int j = 1; j <v[0].length ; j++) {
                //套用公式
                if(w[i-1]>j){
                    v[i][j]=v[i-1][j];
                }else{
                  //v[i][j]=Math.max(v[i-1][j],val[i-1]+v[i-1][j-w[i-1]]);
                    //为了记录商品存放到背包的情况，我们不能直接的使用上面的公式，需要使用if-else来体现公司
                    if(v[i-1][j]<val[i-1]+ v[i-1][j-w[i-1]]){
                        v[i][j]=val[i-1]+ v[i-1][j-w[i-1]];
                        path[i][j]=1;
                    }else{
                        v[i][j]=v[i-1][j];
                    }
                }
                
            }
        }

        for (int i = 0; i <v.length ; i++) {
            for (int j = 0; j <v[i].length ; j++) {
                System.out.print(v[i][j]+"");
            }
            System.out.println();
        }
        //输出最后是放入的那些商品

    }
}
