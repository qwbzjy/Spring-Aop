package com.qwb.spring;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author created by qwb on 2018/9/7 10:52
 */
public class MyBook {
    public void before(){
        System.out.println("前置增强....");
    }

    public void after(){
        System.out.println("后置增强.....");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕增强  方法之前执行........");
        proceedingJoinPoint.proceed();
        System.out.println("环绕增强  方法之后执行.....");

    }
}
