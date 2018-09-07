package com.aop.proxy.jdk;

/**
 * @author created by qwb on 2018/9/7 13:58
 */
public class TestServiceImpl implements TestService {
    @Override
    public int add(){
        System.out.println("开始执行add.....");
        return 0;
    }
}
