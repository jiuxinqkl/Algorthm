package com.rwkj.demo.prim;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class PrimAlgorithm {
    public static void main(String[] args) {
       //ceshi
        char[] data =new char[]{'A','B','C','D','E','F','G'};
        int verxs =data.length;
        //邻接矩阵的关系使用二维数组表示,10000这个大数，表示两个点不联通
        int [][]weight=new int[][]{
                {10000,5,7,10000,10000,10000,2},
                {5,10000,10000,9,10000,10000,3},
                {7,10000,10000,10000,8,10000,10000},
                {10000,9,10000,10000,10000,4,10000},
                {10000,10000,8,10000,10000,5,4},
                {10000,10000,10000,4,5,10000,6},
                {2,3,10000,10000,4,6,10000},};

        //创建MGraph对象
        MGraph graph = new MGraph(verxs);
        //创建一个MinTree对象
        MinTree minTree = new MinTree();
        minTree.createGraph(graph, verxs, data, weight);
        //输出
        minTree.showGraph(graph);
        //测试普利姆算法
        minTree.prim(graph, 0);
    }
}
//创建最小生成树
class MinTree{
    /**
     *
     * @param graph 图对象
     * @param verxs 图对应的顶点个数
     * @param data 图的各个定点的值
     * @param weight 图的临接矩阵
     */
    public void createGraph(MGraph graph,int verxs, char data[],int[][] weight){
        int i, j;
        for (i = 0; i <verxs ; i++) {
            graph.data[i] =data[i];
            for (j= 0; j<verxs ; j++) {
                graph.weight[i][j] =weight[i][j];
            }
        }
    }
    //显示图的方法
    public void showGraph(MGraph graph){
        for (int[] link: graph.weight) {
            System.out.println(Arrays.toString(link));

        }
    }

    //编写一个prim算法 ，得到最小生成树

    /**
     *
     * @param graph 圖
     * @param v 便是从图的第几个定点开始生成
     */
    public void prim (MGraph graph,int v){
        int visited[] = new int[graph.verxs];
        //visited[]默认都是0，表示没有被访问过
/*        for (int i = 0; i <graph.verxs ; i++) {
            visited[i]=0;
        }*/
        visited[v] = 1;
        int h1 = -1;
        int h2 = -1;
        int minWeight=10000;
        for (int K = 1; K < graph.verxs; K++) {
            for (int i = 0; i < graph.verxs; i++) {
                for (int j = 0; j <graph.verxs ; j++) {
                    if(visited[i]==1 && visited[j] ==0 && graph.weight[i][j] <minWeight){
                        //替换minweight寻找已经访问过的节点和未访问过的最小的边
                        minWeight=graph.weight[i][j];
                        h1=i;
                        h2=j;
                    }
                }
            }
            System.out.println("边<" +graph.data[h1]+ "," +graph.data[h2]+ ">权值："+minWeight);
            visited[h2] =1;
            minWeight=10000;
        }
    }
}

class MGraph{
    int verxs;
    char[] data;
    int[][] weight;

    public MGraph(int verxs){
        this.verxs =verxs;
        data = new char[verxs];
        weight = new  int[verxs][verxs];
    }
}
