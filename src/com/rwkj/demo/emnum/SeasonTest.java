package com.rwkj.demo.emnum;

/**
 * 将来需要定义一组常量，需要考虑用枚举类来实现
 * jdk5.0之前
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        System.out.println(spring);
    }
}

//
class Season{
    private final String seasonName;
    private final String SeasonDesc;

    //私有化构造器，并给对象属性赋值
    private Season(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.SeasonDesc=seasonDesc;
    }
    //提供当前枚举的多个对象
    public static final  Season SPRING = new Season("春天","穿那花开");
    public static final  Season SUMMER = new Season("夏天","穿那花开");
    public static final  Season AUTUMN = new Season("秋天","穿那花开");
    public static final  Season WINTER = new Season("冬天","穿那花开");

    //获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }
    //提供tostring（）

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
}