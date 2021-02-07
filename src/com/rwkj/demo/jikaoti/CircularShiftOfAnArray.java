package com.rwkj.demo.jikaoti;

public class CircularShiftOfAnArray {
    public static void main(String[] args) {
        String[] sArr = getChildren(new String[] { "a", "b", "c", "A", "B", "C", "D", "E" }, 5);
        for (String s : sArr) {
            System.out.println(s);
        }
    }
    public static String[] getChildren(String[] data, int index) {
        for (int i = 0; i < index; i++) {
            int j = data.length - 1;
            String loay = data[j];
            System.out.println("--"+i+"--"+loay);
            for (j = data.length - 1; j > 0; j--) {
                data[j] = data[j - 1];
            }
            data[0] = loay;

        }
        return data;
    }
}
