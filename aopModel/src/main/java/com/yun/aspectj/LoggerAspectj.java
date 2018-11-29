package com.yun.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggerAspectj {

    public void before(JoinPoint joinpoint){
        System.out.println("调用方法之前执行");
    }

    public void after(JoinPoint joinpoint){
        System.out.println("调用方法之后执行");
    }

    public void afterReturn(JoinPoint joinpoint,boolean vi){
        System.out.println("调用方法之后并且有返回值执行"+vi);
    }

    public void afterThrow(JoinPoint joinpoint){
        System.out.println("调用方法报错后执行");
    }
}
