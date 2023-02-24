package com.canyan7n.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/24 16:52
 */
public class LifeCycleTest {
    @Test
    public void testLifeCycle(){
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();
    }
}
