package com.aop.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author created by qwb on 2018/9/7 13:59
 */
public class JDKDynamicProxy implements InvocationHandler {
    //被代理的目标对象
    private Object proxyObj;

    /**
     * Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces, InvocationHandler h)
     * loader: 类加载器，定义由哪个ClassLoader对象来对生成的代理对象进行加载
     * interfaces: 表示将要给需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就实现了这些接口
     * h: 表示当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
     * */
    public Object newProxy(Object proxyObj){
        this.proxyObj = proxyObj;
        //返回一个代理对象
        return Proxy.newProxyInstance(proxyObj.getClass().getClassLoader(), proxyObj.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method,Object[] args)throws Throwable{
        before();
        Object object = method.invoke(this.proxyObj, args);
        after();
        return object;
    }
    public void before(){
        System.out.println("开始执行目标对象之前....");
    }
    public void after(){
        System.out.println("开始执行目标对象之后.....");
    }
}
