package com.rwkj.demo.kunchuang;

class psrsion {
    public void show() {
        System.out.println("我是爷爷");
    }
}
class Father extends psrsion {
    public void method(){
        System.out.println("我是爸爸");
    }
}
class Son extends Father {}
class Test {
    public static void main(String[] args) {
        Son s = new Son();
        s.method();
        s.show();
    }
}

