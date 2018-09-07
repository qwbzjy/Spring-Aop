package com.aop.proxy.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * @author created by qwb on 2018/9/7 14:18
 */
public class CGLIBProxy implements MethodInterceptor {

    private Object targetObject;
    /**
     * 构造代理对象
     * @param  targetObject 传递的真实对象
     * @return object 代理对象
     * */
    public Object createProxyInstance(Object targetObject){
        this.targetObject = targetObject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());//设置代理目标
        enhancer.setCallback(this);//设置回调
        return enhancer.create();
    }

    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy)throws Throwable{
        Object result = null;
        try{
            System.out.println("前置处理开始.........");
            result = methodProxy.invoke(targetObject,args);//执行目标对象的方法
            System.out.println("后置处理开始....");
        }catch (Exception e){
            System.out.println("异常处理开始.........");
        }finally {
            System.out.println("调用结束.....");
        }
        return result;

    }
}
