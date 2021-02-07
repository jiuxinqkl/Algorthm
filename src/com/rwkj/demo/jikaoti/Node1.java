package com.rwkj.demo.jikaoti;
//说明生活中遇到的二叉树，用 java 实现二叉树
import java.util.Arrays;
public class Node1 {
    private Node1 left;
    private Node1 right;
    private int value;
    public Node1(int value){
        this.value = value;
    }
    public void add(int value){
        if(value > this.value) {
            if(right != null){
                right.add(value);
            } else {
                Node1 node = new Node1(value);
                right = node;
            }
        }else{
            if(left != null)
                left.add(value);
            else {
                Node1 node = new Node1(value);
                left = node;
            }
        }
    }

    public boolean find(int value){
        if(value == this.value) return true;
        else if(value > this.value){
            if(right == null) return false;
            else return right.find(value);
        }else{
            if(left == null) return false;
            else return left.find(value);
        }
    }

    public void display(){
        System.out.println(value);
        if(left != null) left.display();
        if(right != null) right.display();

    }

 /*public Iterator iterator(){

 71
 }*/

    public static void main(String[] args){
        int[] values = new int[8];
        for(int i=0;i<8;i++){
            int num = (int)(Math.random() * 15);
            if(!contains(values,num))
                values[i] = num;
            else
                i--;
        }

        System.out.println(Arrays.toString(values));

        Node1 root = new Node1(values[0]);
        for(int i=1;i<values.length;i++){
            root.add(values[i]);
        }

        System.out.println(root.find(13));

        root.display();

    }

    public static boolean contains(int [] arr, int value){
        int i = 0;
        for(;i<arr.length;i++){
            if(arr[i] == value) return true;
        }
        return false;
    }

}
