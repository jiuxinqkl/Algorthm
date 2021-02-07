package com.rwkj.demo.timetask;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器指定时间执行程序
 *理解Spring定时任务@Scheduled的两个属性fixedRate 英[fɪkst reɪt]和fixedDelay
 *ixedRate和fixedDelay都是表示任务执行的间隔时间
 *
 * fixedRate和fixedDelay的区别：
 * fixedDelay非常好理解，它的间隔时间是根据上次的任务结束的时候开始计时的。比如一个方法上设置了fixedDelay=5*1000，那么当该方法某一次执行结束后，开始计算时间，当时间达到5秒，就开始再次执行该方法。
 *
 * fixedRate理解起来比较麻烦，它的间隔时间是根据上次任务开始的时候计时的。比如当方法上设置了fiexdRate=5*1000，该执行该方法所花的时间是2秒，那么3秒后就会再次执行该方法。
 * 但是这里有个坑，当任务执行时长超过设置的间隔时长，那会是什么结果呢。打个比方，比如一个任务本来只需要花2秒就能执行完成，我所设置的fixedRate=5*1000，但是因为网络问题导致这个任务花了7秒才执行完成。
 * 当任务开始时Spring就会给这个任务计时，5秒钟时候Spring就会再次调用这个任务，可是发现原来的任务还在执行，这个时候第二个任务就阻塞了（这里只考虑单线程的情况下，多线程后面再讲），
 * 甚至如果第一个任务花费的时间过长，还可能会使第三第四个任务被阻塞。被阻塞的任务就像排队的人一样，一旦前一个任务没了，它就立马执行。
 *@Scheduled(fixedRate)如何避免任务被阻塞
 * 答案是加上注解@EnableAsync（类上）和@Async（方法上），加了注解以后，就开启了多线程模式，当到了下一次任务的执行时机时，如果上一次任务还没执行完，就会自动创建一个新的线程来执行它。异步执行也可以理解为保证了任务以固定速度执行。
 *
 *@Scheduled(fixedRate = 5000 )
 *     public void job(){
 *
 *         LocalTime start = LocalTime.now();
 *         //前面和末尾几个字符串是用来改变打印的颜色的
 *         System.out.println("\033[31;4m" + Thread.currentThread() + " start " + number.incrementAndGet()
 *                 + " @ " + start + "\033[0m");
 *         try {
 *             Thread.sleep(ThreadLocalRandom.current().nextInt(15)*1000);
 *         } catch (InterruptedException e) {
 *             e.printStackTrace();
 *         }
 *
 *         LocalTime end = LocalTime.now();
 *
 *         System.out.println(Thread.currentThread() + " end " + number.get() + " @ "+
 *                  end + ", seconds cost "+ (ChronoUnit.SECONDS.between(start, end)));
 *
 *     }
 *
 * timer.schedule方法中参数详解
 * timer.schedule(new MyTask(event.getServletContext()), 0, 60*60*1000);
 * 第一个参数"new MyTask(event.getServletContext())":
 * 是 TimerTask 类，在包：import java.util.TimerTask .使用者要继承该类，并实现 public void run() 方法，因为 TimerTask 类实现了 Runnable 接口。
 * 第二个参数"0"的意思是:(0就表示无延迟)
 * 制定timer定时器第一次调用run方法的时间，0表示不指时间，立刻调用。一般这个参数指定的时间格式是：yyyy-MM-dd HH:mm:ss
 * 第三个参数"60*60*1000"的意思就是:
 * (单位是毫秒60*60*1000为一小时)
 * (单位是毫秒3*60*1000为三分钟)
 * 第一次调用之后，从第二次开始每隔多长的时间调用一次 run() 方法。
 *
 */
public class TimeTask {
    public static void main(String[] args) {
        timer2();
    }


   // 第二种方法：设定指定任务task在指定延迟delay后进行固定延迟peroid的执行
          // schedule(TimerTask task, long delay, long period)
           public static void timer2() {
            Timer timer = new Timer();
         timer.schedule(new TimerTask() {
      public void run() {
         // 获取当前时间戳

//方法 一System.currentTimeMillis();
          System.out.println(System.currentTimeMillis());

//方法 二Calendar.getInstance().getTimeInMillis();

//方法 三new Date().getTime();

                       System.out.println("-------设定要指定任务--------");
                       }
     }, 1000, 5000);
   }


    public static void timer3() {
          Timer timer = new Timer();

          timer.scheduleAtFixedRate(new TimerTask() {
       public void run() {
                        System.out.println("-------设定要指定任务--------");
                     }
     }, 1000, 2000);
  }


    public static void timer4() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 12); // 控制时
        calendar.set(Calendar.MINUTE, 53);    // 控制分
        calendar.set(Calendar.SECOND, 1);    // 控制秒

        Date time = calendar.getTime();     // 得出执行任务的时间,此处为今天的12：00：00
        System.out.println(time);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println("-------设定要指定任务--------");
                gettime();
            }
        }, time, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行
    }

    public static void gettime(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}

