package com.trc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author created by qwb on 2018/9/7 11:41
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hw1 = (HelloWorld) cx.getBean("helloWorldImpl1");
        HelloWorld hw2 = (HelloWorld) cx.getBean("helloWorldImpl2");
        hw1.printHelloWorld();
        System.out.println("------------");
        hw1.doPrint();

        System.out.println("------------");
        hw2.printHelloWorld();
        System.out.println("------------");
        hw2.doPrint();
    }
}
