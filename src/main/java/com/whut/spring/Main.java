package com.whut.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author created by qwb on 2018/9/7 10:29
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld h = (HelloWorld) cx.getBean("hd");
        h.hello();
    }


}
