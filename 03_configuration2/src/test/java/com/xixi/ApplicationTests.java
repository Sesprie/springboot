package com.xixi;

import com.xixi.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {


    @Autowired
    private Person person;


    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        //查看classpath:beans.xml是否被SpringBoot读取
        System.out.println(ioc.containsBean("helloService"));
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
