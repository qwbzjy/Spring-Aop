package com.trc.spring;

/**
 * @author created by qwb on 2018/9/7 11:31
 */
public class HelloWorldImpl1 implements HelloWorld {
    public void printHelloWorld(){
        System.out.println("Enter HelloWorldImpl1.printHelloWorld");
    }
    public void doPrint(){
        System.out.println("Enter HelloWorldImpl1.doPrint()");
        return;
    }
}
