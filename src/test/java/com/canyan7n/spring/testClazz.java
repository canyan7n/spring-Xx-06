package com.canyan7n.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testClazz {
    @Test
    public void clazzTest(){
        ClassPathXmlApplicationContext di = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz clazz = di.getBean("clazztwo",Clazz.class);
        System.out.println(clazz);
    }
}
