package com.test.bean;

import lombok.ToString;

import java.util.List;
import java.util.Map;

@ToString
public class Student {
    String name;
    int age;
    Card card;
    //List<String> list;
    Map<String, Integer> score;

/*    public void init(){
        System.out.println("我是初始化方法！");
    }
*/
    public Student(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age = age;
    }
/*
    public void destroy(){
        System.out.println("我是销毁方法，我歇逼了！");
    }
*/
    public void setCard(Card card){
        this.card = card;
    }
    /*public void setList(List<String> list){
        this.list = list;
    }*/

   @Deprecated
    public void test(){
       System.out.println("我是过时方法！");
    }

    public void setScore(Map<String, Integer> score) {
        this.score = score;
    }

    public String say(String text){
        System.out.println("我叫"+name+"今年"+age+"岁了，我说："+ text);
        return text;
    }
}