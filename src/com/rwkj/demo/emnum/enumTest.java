package com.rwkj.demo.emnum;

/**
 * 使用enum关键字来定义枚举类
 */
public class enumTest {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);

        //获取父类
        System.out.println(Season1.class.getSuperclass());
    //values()

        Season1[] values = Season1.values();

        for (int i = 0; i <values.length ; i++) {
            System.out.println(values[i]);
        }

        //线程的状态
        Thread.State[] values1 =Thread.State.values();
        for (int i = 0; i <values1.length ; i++) {
            System.out.println(values1[i]);
        }
        //IllegalArgumentException 非法的参数异常
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);

        winter.show();
    }

}

interface Info{
    void show();
}

enum Season1 implements Info{

    //提供当前枚举的多个对象,多个对象之间用，给开，末尾对象；结束
     SPRING("春天","穿那花开"),
     SUMMER("夏天","穿那花开"),
     AUTUMN("秋天","穿那花开"),
     WINTER("冬天","穿那花开");

    private final String seasonName;
    private final String SeasonDesc;

    //私有化构造器，并给对象属性赋值
    private Season1(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.SeasonDesc=seasonDesc;
    }

    //获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("zheshiyige jjie ");
    }
}
