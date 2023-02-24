package com.canyan7n.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStudent {
        @Test
        public void studentTest_IOC() {
                ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//                1.根据id获取bean
                Student student = ioc.getBean("studentone",Student.class);
//                Student student = (Student) ioc.getBean("HelloSpring");
//                2.根据类类型获取bean,bean必须唯一
//                bean不唯一可以根据id+类型获取bean
//                Person student1 = ioc.getBean(Person.class);
                System.out.println(student);
        }
        @Test
        public void studentTest_DI(){
                ClassPathXmlApplicationContext di = new ClassPathXmlApplicationContext("applicationContext.xml");
                Student student = di.getBean("studentfive",Student.class);
                System.out.println(student);
                Student student2 = di.getBean("studentsix",Student.class);
                System.out.println(student2);

//                同一个bean创建的是不是同一个对象,默认是单例模式，结果是同一对象
                Student student3 = di.getBean("studentfive", Student.class);
                System.out.println(student == student3);
        }
}
