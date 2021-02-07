package com.rwkj.demo.jikaoti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目：
 *  现在有多组整数数组，需要将他们合并成一个新的数组。合并规则，从每个数组里按顺序取出固定长度的内容合并到新的数组中，取完的内容会删除掉，如果该行不足固定长度或者已经为空，
 *  则直接取出剩余部分的内容放到新的数组中，继续下一行。如样例1，获得长度3，先遍历第一行，获得2,5,6；再遍历第二行，获得1,7,4；再循环回到第一行，
 *  获得7,9,5；再遍历第二行，获得3,4；再回到第一行，获得7，按顺序拼接成最终结果。
 * 输入描述：
 *
 * 第一行是每次读取的固定长度，长度>0；
 * 第2-n行是需要合并的数组，不同的数组用回车换行分隔，数组内部用逗号分隔。
 *
 * 输出描述：
 * 输出一个新的数组，用逗号分隔。
 * 输入：
 * 3
 * 2,5,6,7,9,5,7
 * 1,7,4,3,4
 * 4,5,7,1,3,8
 * 输出：
 * 2,5,6,1,7,4,4,5,7,7,9,5,3,4,1,3,8,7
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("----->"+n);
        /*
            随着输入增加，要拼接的数组会增多，那么拼接的结果就会变化
            所以我定义了两个list，把所有的输入，存进一个list中; 然后另一个list每次只复制allList的值
            如果只定义一个的话，会把前面的值清空
         */
        List<String> allLine = new ArrayList<>();  // 随着输入增加，把所有的组以String存进list中
        List<String> line = new ArrayList<>();     // 把目前的输入情况放到这个list中

        scan.nextLine();  // 不知道为什么，如果不加这一行，后面的scan.nextLine()就读不到数据，有知道的可以告诉我一下

        while (scan.hasNext()) {
            // 把一行输入存储进All List中
          //  System.out.println(scan.nextLine());
            allLine.add(scan.nextLine());

            // 把当前的所有输入转到line中，随着后面的拼接，line里的内容会清空
            for (int i = 0; i < allLine.size(); i++) {
                line.add(allLine.get(i));
          //      System.out.println(allLine.get(i));
            }

            // 接下来就line里的所有数组进行拼接了；而所有结果都在all list中，不会造成影响

            StringBuilder result = new StringBuilder();
            String tmp;
            int flag = 0;
            int tmpSize = line.size();

            while (flag < tmpSize) {
                for (int j = 0; j < line.size(); j++) {
                    tmp = line.get(j);

                    // list的这个位置已经清空，不需要再进行拼接
                    if (tmp.length() == 0) {
                        flag++;
                        line.remove(j);
                        continue;
                    }

                    // 一行输入，需要以逗号分隔
                    String[] nums = tmp.split(",");

                    // 长度不足n位，则剩下的全部加到结果数组中
                    if (nums.length <= n) {
                        result.append(tmp).append(",");
                        line.set(j, "");
                        continue;
                    }

                    String sc = nums[0] + "," + nums[1] + "," + nums[2] + ",";
                    result.append(sc);  // 有3位，直接把这3位数字拼接到数组末尾
                    line.set(j, tmp.substring(sc.length()));  // 原字符 则 减掉这3位
                }
            }
            // 输出结果，注意要把末尾的逗号去掉
            System.out.println(result.substring(0, result.length() - 1));

        }
    }
}