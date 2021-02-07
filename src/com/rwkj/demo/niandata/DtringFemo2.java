package com.rwkj.demo.niandata;

import javax.swing.text.StyleContext;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * jdk8riqi和时间的测试
 * Java.time.API
 */
public class DtringFemo2 {


    public static void main(String[] args) {
        //偏移量
        Date date=new Date(2020-1900,9-1,8);
        System.out.println(date);
        //now（）//获取当前时间
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println(localDateTime);
       //of();设置指定的年月日时分秒，没有偏移量
        LocalDateTime of = LocalDateTime.of(2020, 10, 6, 13, 23, 44);
        System.out.println(of);


        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(
                localDateTime.getDayOfYear()
        );
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

//////////////////////////////////////////////////////////
        //instant  1970年1月1日0时0分0秒
        Instant instant = Instant.now();
        System.out.println(instant);
        //获取当前时间，
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        //sm.sou
       //获取毫秒数
        long l = instant.toEpochMilli();
        System.out.println(l);
        Instant instant1 = Instant.ofEpochMilli(l);
        System.out.println(instant1);



        //DateTimeFormatter 格式化时间

        DateTimeFormatter datetime =   DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime now1 = LocalDateTime.now();

    }
}
