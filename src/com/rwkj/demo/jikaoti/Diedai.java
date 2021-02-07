package com.rwkj.demo.jikaoti;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class Diedai {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>();
        all.add("hello");
        all.add("_");
        all.add("world");

        ListIterator<String> iter = all.listIterator(); // 实例化ListIterator接口

        System.out.println("由前向后输出：");
        while(iter.hasNext()) {
            String str = iter.next();
            System.out.print(str + "、");
        }

        System.out.println("由后向前输出：");
        while(iter.hasPrevious()) {
            String str = iter.previous();
            System.out.print(str + "、");
        }

        /**
         *for遍历
         */

        List<String> all1 = new ArrayList<String>();
        all1.add("hello");
        all1.add("_");
        all1.add("world");

        for(String s: all1) {
            System.out.print(s + "、");
        }


        /**
         * Stack
         *
         * Stack：栈
         * empty()
         * boolean
         * 测试栈是否为空
         * 检查是否空
         *
         *
         * push(E item)
         * E
         * 入栈
         * 入栈
         *
         *
         * pop()
         * E
         * 出栈，同时删除
         * 出栈
         *
         *
         * peek()
         * E
         * 查看栈顶，但不删除
         * 栈顶
         *
         *
         * search(Object o)
         * int
         * 在栈中查找
         * 查找
         *
         *
         *
         * 例子：
         * ↓CloseCode↓Stack<String> s = new Stack<String>();
         * s.push("A");
         * s.push("B");
         * s.push("C");
         *
         * System.out.print(s.pop + '、');
         * System.out.print(s.pop + '、');
         * System.out.print(s.pop + '、');
         *
         */

        /**
         *Queue：队列
         * 作为一个接口，它没有实现任何具体功能（都是抽象方法），所以我们只能用其他的类来实现Queue接口。
         *
         * LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
         * Queue<String> queue = new LinkedList<String>();
         * 方法
         * 返回类型
         * 描述
         * 备注
         *
         *
         *
         *
         * offer(E o)
         * boolean
         * 将指定元素增加到队尾
         * 如果队列已满，则返回false
         *
         *
         * poll()
         * E
         * 找到并删除队头
         * （获取）如果队列为空，则返回null
         *
         *
         * peek()
         * E
         * 找到但不删除队头
         * （读取）如果队列为空，则返回null
         *
         *
         * add(E o)
         * void
         * 将指定元素增加到队尾
         * 如果队列已满，则抛出一个IIIegaISlabEepeplian异常
         *
         *
         * remove()
         * E
         * 找到并移除队头
         * （移除本应有的）如果队列为空，则抛出一个NoSuchElementException异常
         *
         *
         * element()
         * E
         * 找到队头
         * （找到本应有的元素）如果队列为空，则抛出一个NoSuchElementException异常
         * Queue<String> queue=new LinkedList<String>();
         * queue.offer("Hello");
         * queue.offer("World!");
         * queue.offer("你好！");
         *
         * System.out.println(queue.size());
         *
         * for(String str: queue){
         *     System.out.printf(str + " ");
         * }
         * System.out.printf("\n");
         *
         * System.out.println(queue.size());
         * String str;
         *
         * while((str=queue.poll()) != null) {
         *     System.out.printf(str + " ");
         * }
         * System.out.println();
         * System.out.println(queue.size());
         *
         */


    }
}
