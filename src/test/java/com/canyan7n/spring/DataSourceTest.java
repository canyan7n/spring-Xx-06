package com.canyan7n.spring;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class DataSourceTest {
    @Test
    public void testDataSource(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource druidDataSource = ioc.getBean(DruidDataSource.class);
        try {
            System.out.println(druidDataSource.getConnection());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
