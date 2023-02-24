package com.canyan7n.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testHelloSpring {
    @Test
    public void helloSpringTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("HelloSpring");
        helloSpring.show();
    }
}
