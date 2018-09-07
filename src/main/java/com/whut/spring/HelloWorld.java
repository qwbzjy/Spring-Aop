package com.whut.spring;

/**
 * @author created by qwb on 2018/9/7 10:28
 */
public class HelloWorld {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("hello: "+name);
    }
}
