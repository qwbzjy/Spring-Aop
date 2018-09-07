package com.aop.proxy.jdk;

/**
 * @author created by qwb on 2018/9/7 14:13
 */
public class ProxyTest {
    public static void main(String[] args) {
        /**
         * Spring AOP主要有两种代理方式：

         1.JDK动态代理  2.cglib代理
         1、如果目标对象实现了接口，默认情况下会采用JDK的动态代理实现AOP
         2、如果目标对象实现了接口，可以强制使用CGLIB实现AOP
         3、如果目标对象没有实现了接口，必须采用CGLIB库，spring会自动在JDK动态代理和CGLIB之间转换
         注：JDK动态代理要比cglib代理执行速度快，但性能不如cglib好。
         * */
        TestService testService = new TestServiceImpl();
        testService.add();
        System.out.println("------------------");
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy();
        TestService testService1 = (TestService) jdkDynamicProxy.newProxy(testService);
        testService1.add();
    }
}
