package com.test.aop;
import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;

import java.sql.Array;
import java.util.Arrays;

@Log
public class AopTest {
    public void before(){
        log.info("我是方法执行之前的日志！");
    }

    public void after(JoinPoint point){
        System.out.println(point.getThis());
        System.out.println(Arrays.toString(point.getArgs()));
        log.info("我是方法执行之后的日志！");
    }
}
