package com.trc.spring;

/**
 * @author created by qwb on 2018/9/7 11:33
 */
public class HelloWorldImpl2 implements HelloWorld
    {
        public void printHelloWorld(){
            System.out.println("Enter HelloWorldImpl2.printHelloWorld");
        }

        public void doPrint(){
            System.out.println("Enter HelloWorldImpl2.doPrint()");
            return;
        }
}
