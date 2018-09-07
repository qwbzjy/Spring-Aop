package com.aop.proxy.cglib;

/**
 * @author created by qwb on 2018/9/7 14:28
 */
public class ProxyTest {
    public static void main(String[] args) {
        TestCGLIBServiceImpl testCGLIB = new TestCGLIBServiceImpl();
        testCGLIB.add();
        System.out.println("==================");
        CGLIBProxy cglibProxy = new CGLIBProxy();
        TestCGLIBServiceImpl testCGLIBProxy = (TestCGLIBServiceImpl) cglibProxy.createProxyInstance(testCGLIB);
        testCGLIBProxy.add();
    }
}
