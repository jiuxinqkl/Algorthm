package com.rwkj.demo.optio;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {
/**
 * optional.of(T t) 必須非空的
 * optional.empty()
 * Optional.ofNullable(T t)
 *
 */

  @Test
  public void Test(){
      Girl girl = new Girl();
    //  girl=“”;
      //保證是非空的
      Optional<Girl> girl1 = Optional.of(girl);
      System.out.println(girl1);
  }

  @Test
  public void Test1(){
        Girl girl = new Girl();
         girl=null;
        Optional<Girl> girl1 = Optional.ofNullable(girl);
      Girl girl2 = girl1.orElse(new Girl("888"));
      System.out.println(girl2);
  }

   public String getGirlName(Boy boy){
      return boy.getGirl().getName();
   }
   @Test
    public void test2(){
       Boy boy = new Boy();
       String girlName = getGirlName(boy);
       System.out.println(girlName);
   }

    public String getGirlName1(Boy boy){
      if(boy!=null){
          Girl girl = boy.getGirl();
          if(girl !=null){
              return girl.getName();
          }
      }
        return null;
    }

    @Test
    public void test3(){
        Boy boy = new Boy();
        String girlName = getGirlName1(boy);
        System.out.println(girlName);
    }

    /**
     * 使用optional
     * 
     */
    public void getGirlName2(Boy boy){
        Optional<Boy> boy1 = Optional.of(boy);
        
    }

    @Test
    public  void test5(){
        Optional<Object> empty = Optional.empty();
        if (empty.isPresent()){ //判断数据到底是不是一个null
            System.out.println("数据为空");
        }else{
            System.out.println(empty);
            System.out.println(empty.isPresent());//是否包含数据
        }
    }
}
