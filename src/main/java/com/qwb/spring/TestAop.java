package com.qwb.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author created by qwb on 2018/9/7 10:59
 */
public class TestAop {

    @Test
    public void test(){
        ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book bk = (Book) cx.getBean("book");
        bk.add();

    }
}
